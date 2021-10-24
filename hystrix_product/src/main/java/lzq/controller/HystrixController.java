package lzq.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizuoqun
 * @version 1.0
 * @date 2021-10-24 14:09
 */
@RestController
public class HystrixController {

    @GetMapping(value = "/demo")
    @HystrixCommand(fallbackMethod = "fallbackDemo")
    public String demo(Integer id){
        if(id<0){
            throw new Error("id 不合法");
        }
        return "demo ok ";
    }
    public String fallbackDemo(Integer id){
        return "服务已熔断";
    }
}
