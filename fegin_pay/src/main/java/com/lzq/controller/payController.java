package com.lzq.controller;

import com.lzq.feginclient.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizuoqun
 * @version 1.0
 * @date 2021-10-10 21:35
 */
@RestController
public class payController {

    @Autowired
    private ProductClient productClient;

    @GetMapping("/getPay")
    public String getPay(){
        String product = productClient.getProduct();
        return "pay ok ! == "+ product;
    }
}
