package com.tx.orderdome.mapper;

import com.tx.orderdome.base.service.GenericMapper;
import com.tx.orderdome.pojo.Stock;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockMapper extends GenericMapper<Stock> {
}