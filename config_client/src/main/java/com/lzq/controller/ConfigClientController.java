package com.lzq.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizuoqun
 * @version 1.0
 * @date 2021-10-30 21:14
 */
@RestController
public class ConfigClientController {

    @Value("${name}")
    private String name;
    @GetMapping("/demo")

    public String demo(){
        return "demo ok" + name;
    }
}
