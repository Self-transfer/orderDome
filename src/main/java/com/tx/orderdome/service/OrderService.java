package com.tx.orderdome.service;

import com.tx.orderdome.pojo.Order;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {


     void createOrder(Order order);
}
