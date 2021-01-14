package com.nnk.springboot.service;

import com.nnk.springboot.domain.Trade;
import com.nnk.springboot.repositories.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TradeService {

    @Autowired
    private TradeRepository tradeRepository;

    public List<Trade> findAll() {
        return tradeRepository.findAll();
    }

    public Trade findById (Integer id) {
        return tradeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID :" + id));
    }

    public void delete (Integer id) {
        tradeRepository.deleteById(id);
    }

    public void save (Trade trade) {
        trade.setCreationDate(Timestamp.valueOf(LocalDateTime.now()));
        trade.setRevisionDate(Timestamp.valueOf(LocalDateTime.now()));
        tradeRepository.save(trade);
    }

}
