package com.ribbon.ribbon7000.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ylx
 */
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getName")
    public String getName(){
        //配置路由为http://服务名称/请求路径
        return restTemplate.getForObject("http://client7001/test/getName", String.class);
    }
}
