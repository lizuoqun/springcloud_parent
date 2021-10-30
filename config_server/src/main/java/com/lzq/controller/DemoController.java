package com.lzq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizuoqun
 * @version 1.0
 * @date 2021-10-30 21:00
 */
@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo(){
        return "demo";
    }
}
