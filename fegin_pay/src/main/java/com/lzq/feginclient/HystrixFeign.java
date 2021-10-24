package com.lzq.feginclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * @author lizuoqun
 * @version 1.0
 * @date 2021-10-24 18:42
 */
@FeignClient(value="HYSTRIX",fallback=HystrixService.class )
public interface HystrixFeign {
    /**
     * 服务调用
     *
     * @param id
     * @return String
     * */
    @GetMapping("/demo")
    String demo(@RequestParam Integer id);
}
