package com.cjs.amory.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: amory
 * @Date: 2019-07-10 16:15
 */
@SpringBootApplication
@EnableEurekaClient
public class ClientGateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientGateWayApplication.class, args);
    }
}
