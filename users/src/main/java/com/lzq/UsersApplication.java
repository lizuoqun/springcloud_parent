package com.lzq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lizuoqun
 * @version 1.0
 * @date 2021-09-26 20:21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UsersApplication {
    public static void main(String[] args) {
        SpringApplication.run(UsersApplication.class,args);
    }
}
