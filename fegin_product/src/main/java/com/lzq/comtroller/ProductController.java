package com.lzq.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizuoqun
 * @version 1.0
 * @date 2021-10-10 21:38
 */
@RestController
public class ProductController {

    @GetMapping("/getProduct")
    public String getProduct(){
        return "product ok!";
    }
}
