package com.nnk.springboot.controllers;

import com.nnk.springboot.domain.RuleName;
import com.nnk.springboot.repositories.RuleNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class RuleNameController {

    // DONE: Inject RuleName service

    @Autowired
    private RuleNameRepository ruleNameRepository;
    @RequestMapping("/ruleName/list")
    public String home(Model model)
    {
        // DONE: find all RuleName, add to model
        model.addAttribute("ruleNames",ruleNameRepository.findAll());
        return "ruleName/list";
    }

    @GetMapping("/ruleName/add")
    public String addRuleForm(Model model) {
        model.addAttribute("ruleName", new RuleName());
        return "ruleName/add";
    }

    @PostMapping("/ruleName/validate")
    public String validate(@Valid RuleName ruleName, BindingResult result, Model model) {
        // DONE: check data valid and save to db, after saving return RuleName list
        if(!result.hasErrors()){
            ruleNameRepository.save(ruleName);
            model.addAttribute("ruleNames",ruleNameRepository.findAll());
            return "/ruleName/list";
        }
        return "ruleName/add";
    }

    @GetMapping("/ruleName/update/{id}")
    public String showUpdateForm(@PathVariable("id") Integer id, Model model) {
        // DONE: get RuleName by Id and to model then show to the form
        RuleName ruleName = ruleNameRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid RuleName Id:" + id));
        model.addAttribute("ruleName", ruleName);
        return "ruleName/update";
    }

    @PostMapping("/ruleName/update/{id}")
    public String updateRuleName(@PathVariable("id") Integer id, @Valid RuleName ruleName, BindingResult result, Model model) {
        // DONE: check required fields, if valid call service to update RuleName and return RuleName list
        if(result.hasErrors()){
            return "ruleName/list";
        }
        ruleName.setId(id);
        ruleNameRepository.save(ruleName);
        model.addAttribute("ruleNames",ruleNameRepository.findAll());
        return "redirect:/ruleName/list";
    }

    @GetMapping("/ruleName/delete/{id}")
    public String deleteRuleName(@PathVariable("id") Integer id, Model model) {
        // DONE: Find RuleName by Id and delete the RuleName, return to Rule list
        RuleName ruleName = ruleNameRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid RuleName Id:" + id));
        ruleNameRepository.delete(ruleName);
        model.addAttribute("ruleNames",ruleNameRepository.findAll());
        return "redirect:/ruleName/list";
    }
}
