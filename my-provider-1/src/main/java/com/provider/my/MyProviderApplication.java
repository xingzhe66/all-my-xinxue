package com.provider.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MyProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProviderApplication.class, args);
    }

}
