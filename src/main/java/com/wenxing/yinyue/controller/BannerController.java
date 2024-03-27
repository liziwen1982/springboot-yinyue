package com.wenxing.yinyue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BannerController {
    @GetMapping("/banner")
    public String banner(){
        return "banner";
    }
}
