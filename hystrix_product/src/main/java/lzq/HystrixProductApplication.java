package lzq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lizuoqun
 * @version 1.0
 * @date 2021-09-25 21:28
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class HystrixProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixProductApplication.class,args);
    }
}
