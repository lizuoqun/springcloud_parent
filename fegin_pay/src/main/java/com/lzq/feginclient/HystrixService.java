package com.lzq.feginclient;


import org.springframework.context.annotation.Configuration;

/**
 * @author lizuoqun
 * @version 1.0
 * @date 2021-10-24 18:42
 */
@Configuration
public class HystrixService implements HystrixFeign {
    @Override
    public String demo(Integer id){
        return "熔断";
    }
}
