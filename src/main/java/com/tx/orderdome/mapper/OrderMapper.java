package com.tx.orderdome.mapper;


import com.tx.orderdome.pojo.Order;
import com.tx.orderdome.base.service.GenericMapper;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface OrderMapper extends GenericMapper<Order> {
    void insertOrder(Order order);
}
