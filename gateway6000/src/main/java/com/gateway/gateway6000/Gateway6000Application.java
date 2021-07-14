package com.gateway.gateway6000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * gateway网关，可配置过滤条件及路由配置
 */
@SpringBootApplication
public class Gateway6000Application {

    public static void main(String[] args) {
        SpringApplication.run(Gateway6000Application.class, args);
    }

}
