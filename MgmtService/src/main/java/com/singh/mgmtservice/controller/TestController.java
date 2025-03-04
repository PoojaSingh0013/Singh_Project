package com.singh.mgmtservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/1")
public class TestController {

    @GetMapping("/get")
    public String test(){
        return "PoojaRaniAshok";
    }

    @GetMapping("/get-hello")
    public String testHello(){
        return "PoojaRaniAshok JAVA WORLD";
    }
}