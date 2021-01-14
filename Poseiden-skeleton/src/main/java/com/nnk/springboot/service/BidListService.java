package com.nnk.springboot.service;

import com.nnk.springboot.domain.BidList;
import com.nnk.springboot.repositories.BidListRepository;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class BidListService {

    @Autowired
    private BidListRepository bidListRepository;

    public List<BidList> findAll() {
        return bidListRepository.findAll();
    }

    public void save (BidList bidList) {
        bidList.setCreationDate(Timestamp.valueOf(LocalDateTime.now()));
        bidList.setRevisionDate(Timestamp.valueOf(LocalDateTime.now()));
        bidListRepository.save(bidList);
    }

    public BidList findById (Integer id) {
        return bidListRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID :" + id));
    }

    public void delete (Integer id) {
        bidListRepository.deleteById(id);
    }

}
