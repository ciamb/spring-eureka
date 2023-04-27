package com.ciamb.springeurekaclientpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringEurekaClientPageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaClientPageApplication.class, args);
    }

}
