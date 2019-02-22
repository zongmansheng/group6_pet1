package com.qf.group6;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan(basePackages = "com.qf.group6.dao")
public class SpringbootPetApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPetApplication.class, args);
    }

}

