package com.tx.orderdome.service;


import org.springframework.stereotype.Service;

@Service
public interface StockService {


     void decrByStock(String stockName);
     Integer selectByExample(String stockName);
}
