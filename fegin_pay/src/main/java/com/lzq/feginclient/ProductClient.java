package com.lzq.feginclient;

import com.lzq.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 调用 Product 服务
 *
 * @author lizuoqun
 */
@FeignClient(value = "Product")
public interface ProductClient {

    /**
     * 服务调用
     * @return String
     * */
    @GetMapping("/getProduct")
    String getProduct();

    /**
     * 零散参数 带问号进行传递
     * @param name
     * @param age
     * @return String
     */
    @GetMapping(value = "/params")
    String params(@RequestParam String name, @RequestParam Integer age);

    /**
     * 零散参数 占位符传递
     * @param name
     * @return String
     * */
    @GetMapping(value = "/path/{name}")
    String path(@PathVariable String name);

    /**
     * 对象参数
     * @param product
     * @return String
     * */
    @PostMapping(value = "/obj")
    String obj(@RequestBody Product product);

    /**
     * 数组参数
     * @param ids
     * @return String
     * */
    @PostMapping(value = "/arr")
    String arr(@RequestParam String [] ids);

    /**
     * 返回对象
     * @param id
     * @return Product
     * */
    @GetMapping(value = "/product")
    Product product(@RequestParam Long id);
}
