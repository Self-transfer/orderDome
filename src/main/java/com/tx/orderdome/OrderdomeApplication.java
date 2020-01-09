package com.tx.orderdome;

import com.tx.orderdome.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.tx.orderdome.mapper")
public class OrderdomeApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(OrderdomeApplication.class, args);
    }

    @Autowired
    private RedisService redisService;

    /**
     * redis初始化商品的库存量和信息
     *
     * @param args
     * @throws Exception
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        redisService.put("iphone11 Pro max", 10, 20);
    }

}