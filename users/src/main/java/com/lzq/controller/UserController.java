package com.lzq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizuoqun
 * @version 1.0
 * @date 2021-09-26 20:30
 */
@RestController
public class UserController {

    @GetMapping("/getUser")
    public String getUser(){
        return "get user";
    }
}
