package com.wenxing.yinyue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class VideoGroupList {
    @GetMapping("/video/group/list")
    public String videoGroupList(){
        StringBuilder strRet = new StringBuilder();

        strRet = new StringBuilder("{\"code\":\"200\",\"message\":\"success\"," +
                "\"data\":[");

        for (int i = 0; i < 100; i++) {
            strRet.append("{\"id\":\"" + i + "\", \"name\":\"现场" + i + "\"},");
        }

        strRet = new StringBuilder(strRet.substring(0, strRet.length() - 1));
        strRet.append("]}");

        System.out.println(strRet);

        return strRet.toString();
    }
}
