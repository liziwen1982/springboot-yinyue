package com.wenxing.yinyue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Personlized {
    @GetMapping("/personlized")
    public String personlized(@RequestParam(name = "limit", defaultValue = "1") String limit){
        String strRet = "{" +
                "\"result\":[" +
                "{\"picUrl\":\"http://192.168.66.13/wechat/1.jpg\", \"id\":\"1\", \"name\":\"好长的歌曲名1好长的歌曲名1好长的歌曲名1好长的歌曲名1好长的歌曲名1好长的歌曲名1\"}," +
                "{\"picUrl\":\"http://192.168.66.13/wechat/2.jpg\", \"id\":\"2\", \"name\":\"好长的歌曲名1好长的歌曲名1好长的歌曲名1好长的歌曲名1好长的歌曲名1好长的歌曲名1\"}," +
                "{\"picUrl\":\"http://192.168.66.13/wechat/3.jpg\", \"id\":\"3\", \"name\":\"好长的歌曲名1好长的歌曲名1好长的歌曲名1好长的歌曲名1好长的歌曲名1好长的歌曲名1\"}," +
                "{\"picUrl\":\"http://192.168.66.13/wechat/4.png\", \"id\":\"4\", \"name\":\"好长的歌曲名1好长的歌曲名1好长的歌曲名1好长的歌曲名1好长的歌曲名1好长的歌曲名1\"}" +
                "]" +
                "}";

        System.out.println(strRet);
        System.out.println("limit:" + limit);
        return strRet;
    }
}
