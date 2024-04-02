package com.wenxing.yinyue.controller;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class VideoGroup {
    @GetMapping("/video/group/list")
    public String videoGroupList(){
        StringBuilder strRet = new StringBuilder();

        strRet = new StringBuilder("{\"code\":\"200\",\"message\":\"success\"," +
                "\"data\":[");

        for (int i = 0; i < 100; i++) {
            strRet.append("{\"id\":\"" + i + "\", \"name\":\"视频组" + i + "\"},");
        }

        strRet = new StringBuilder(strRet.substring(0, strRet.length() - 1));
        strRet.append("]}");

        System.out.println(strRet);

        return strRet.toString();
    }

    @GetMapping("/video/group")
    public String videoGroup(@RequestParam(name = "id", defaultValue = "") String id,
                             @CookieValue(name = "cookie3", required = false) String cookie3){
        System.out.println("cookie3:" + cookie3);
        return "{\"code\":\"200\"}";
    }
}
