package com.wenxing.yinyue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class UserRecord {
    @GetMapping("/user/record")
    public String userRecord(@RequestParam(name = "uid", defaultValue = "") String uid,
                             @RequestParam(name = "type", defaultValue = "") String type){

        System.out.println("uid:" + uid);

        StringBuilder strRet = new StringBuilder();
        if(Objects.equals(uid, "1234512345"))
        {
            strRet = new StringBuilder("{\"code\":\"200\"," +
                    "\"allData\":[");

            for (int i = 0; i < 100; i++) {
                strRet.append("{\"playcount\":\"10\", \"score\":\"80\", \"song\":{\"name\":\"{i}\", \"al\":{\"picUrl\":\"http://192.168.66.13/wechat/1.jpg\"}}},");
            }

            strRet = new StringBuilder(strRet.substring(0, strRet.length() - 1));
            strRet.append("]}");
        }
        else {
            System.out.println("not equals!");
        }
        System.out.println(strRet);

        return strRet.toString();
    }
}
