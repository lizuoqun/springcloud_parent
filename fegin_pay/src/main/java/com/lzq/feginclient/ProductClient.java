package com.lzq.feginclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *  调用 Product 服务
 *  @author lizuoqun
 * */
@FeignClient(value="Product")
public interface ProductClient {

    @GetMapping("/getProduct")
    String getProduct();
}
