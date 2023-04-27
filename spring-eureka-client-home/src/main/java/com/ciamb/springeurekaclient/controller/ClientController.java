package com.ciamb.springeurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class ClientController {

    @GetMapping
    public String getHome() {
        return "Eureka Home Client application";
    }
}
