package com.ribbon.ribbon7000.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ribbon负载均衡配置
 * @author ylx
 */
@Configuration
public class RibbonCofing {

    /**
     * 使用随机策略
     * @return
     */
    @Bean
    public IRule ribbonRuie(){
        return new RandomRule();
    }
}
