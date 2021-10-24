package com.lzq.controller;

import com.lzq.entity.Product;
import com.lzq.feginclient.HystrixFeign;
import com.lzq.feginclient.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author lizuoqun
 * @version 1.0
 * @date 2021-10-10 21:35
 */
@RestController
public class PayController {

    @Autowired
    private ProductClient productClient;

    @Autowired
    private HystrixFeign hystrixFeign;

    @GetMapping("/getPay")
    public String getPay(){
        String product = productClient.getProduct();
        // 带参数传递
        String params = productClient.params("huangyueyue",10);
        String path = productClient.path("this is name");
        String obj = productClient.obj(new Product(1L,"商品",new Date()));
        String arr = productClient.arr(new String[]{"12","25","29"});
        Product p = productClient.product(1L);
        return product + "    "+ params +"    "+ path + obj + arr + p.toString();
    }

    @GetMapping(value = "/demo")
    public String demo(@RequestParam Integer id){
        hystrixFeign.demo(id);
        return "demo feign";
    }
}
