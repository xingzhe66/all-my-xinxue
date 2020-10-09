package com.ba.my.myprovider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MyProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(MyProvider2Application.class, args);
    }

}
