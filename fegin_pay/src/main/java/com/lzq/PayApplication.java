package com.lzq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lizuoqun
 * @version 1.0
 * @date 2021-10-10 21:33
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients // 开启fegin客户端调用
public class PayApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayApplication.class,args);
    }
}
