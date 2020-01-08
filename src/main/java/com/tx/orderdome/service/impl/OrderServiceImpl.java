package com.tx.orderdome.service.impl;


import com.tx.orderdome.mapper.OrderMapper;
import com.tx.orderdome.pojo.Order;
import com.tx.orderdome.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void createOrder(Order order) {
        orderMapper.insert(order);
    }


}
