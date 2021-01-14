package com.nnk.springboot.service;

import com.nnk.springboot.controllers.RuleNameController;
import com.nnk.springboot.domain.RuleName;
import com.nnk.springboot.repositories.RuleNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuleNameService {

    @Autowired
    private RuleNameRepository ruleNameRepository;

    public List<RuleName> findAll() {
        return ruleNameRepository.findAll();
    }

    public RuleName findById (Integer id) {
       return ruleNameRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID : " + id));
    }

    public void save (RuleName ruleName) {
        ruleNameRepository.save(ruleName);
    }

    public void delete (Integer id) {
        ruleNameRepository.deleteById(id);
    }

}
