package com.lzq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author lizuoqun
 * @version 1.0
 * @date 2021-09-26 20:29
 */
@RestController
public class OrderController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate getRestTemplate;

    @GetMapping("/order")
    public String getOrder() {
        RestTemplate restTemplate = new RestTemplate();
        String res = restTemplate.getForObject("http://localhost:8888/getUser", String.class);

        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("Users");
        serviceInstances.forEach(serviceInstance -> {
            System.out.println("host = "+ serviceInstance.getHost() +", port ="+ serviceInstance.getPort() +", url ="+ serviceInstance.getUri());
        });

        ServiceInstance serviceInstances1 = loadBalancerClient.choose("Users");
        System.out.println("url = " + serviceInstances1.getUri()+", port = "+serviceInstances1.getPort() + " ,host = "+serviceInstances1.getHost());
        System.out.println("res = " + res);
        return "getOrder" + " ====  " + res;
    }

    @GetMapping("/ribbonOrder")
    public String getRibbonOrder() {
        String res = getRestTemplate.getForObject("http://Users/getUser", String.class);
        return "getOrder" + " ====  " + res;
    }
}
