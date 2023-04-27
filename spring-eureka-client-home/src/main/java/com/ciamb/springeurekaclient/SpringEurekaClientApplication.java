package com.ciamb.springeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaClientApplication.class, args);
    }

}
