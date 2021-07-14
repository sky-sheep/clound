package com.nacos.client7001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ylx
 */
@RestController
@RequestMapping("test")
public class NacosController {

    @Value(value = "${server.port}")
    private String name;

    @GetMapping("/getName")
    public String getName(){
        return name;
    }
}
