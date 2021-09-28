package com.lzq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lizuoqun
 * @version 1.0
 * @date 2021-09-26 20:29
 */
@RestController
public class OrderController {

    @GetMapping("/order")
    public String getOrder(){
        RestTemplate restTemplate = new RestTemplate();
        String res =restTemplate.getForObject("http://localhost:8888/getUser",String.class);
        System.out.println("res = " + res);
        return "getOrder" + " ====  " + res;
    }
}
