package com.newmedia.stockpredict;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.newmedia.stockpredict.repository")
public class StockPredictApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockPredictApplication.class, args);
    }

}
