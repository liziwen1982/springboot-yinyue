package com.wenxing.yinyue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BannerController {
    @GetMapping("/banner")
    public String banner(){

        String strRet = "{" +
                "\"banners\":[" +
                "{\"pic\":\"http://192.168.66.13/wechat/1.jpg\", \"bannerId\":\"1\"}," +
                "{\"pic\":\"http://192.168.66.13/wechat/2.jpg\", \"bannerId\":\"2\"}," +
                "{\"pic\":\"http://192.168.66.13/wechat/3.jpg\", \"bannerId\":\"3\"}" +
                "]" +
                "}";

        System.out.println(strRet);
        return strRet;
    }
}
