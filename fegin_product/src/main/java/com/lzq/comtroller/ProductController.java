package com.lzq.comtroller;

import com.lzq.entity.Product;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

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

    @GetMapping(value = "/params")
    public String params(@RequestParam String name, @RequestParam Integer age){
        return name + age;
    }

    @GetMapping(value = "/path/{name}")
    public String path(@PathVariable String name){
        return name;
    }

    @PostMapping(value = "/obj")
    public String obj(@RequestBody Product product){
        return product.toString();
    }

    @PostMapping(value = "/arr")
    public String arr(@RequestParam String [] ids){
        String res = "";
        for (String id : ids){
            // 数组遍历
            res += id;
        }
        return res;
    }
}
