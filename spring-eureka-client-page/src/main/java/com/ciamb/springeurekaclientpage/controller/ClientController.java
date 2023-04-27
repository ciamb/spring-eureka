package com.ciamb.springeurekaclientpage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/page")
public class ClientController {

    @GetMapping
    private String getPage() {
        return "Eureka Page Client Application";
    }
}
