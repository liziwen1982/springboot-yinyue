package com.wenxing.yinyue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopList {
    @GetMapping("/top/list")
    public String topList(@RequestParam(name = "index", defaultValue = "0") String index){
        String strRet = "{" +
                "\"playlist\":{\"plName\":\"plName" + index + "\"," +
                "\"tracks\":[{\"trcUrl\":\"http://192.168.66.13/wechat/1.jpg\", \"name\":\"name1\", \"id\":\"id1\"}, {\"trcUrl\":\"http://192.168.66.13/wechat/2.jpg\", \"name\":\"name2\", \"id\":\"id2\"}, {\"trcUrl\":\"http://192.168.66.13/wechat/3.jpg\", \"name\":\"name3\", \"id\":\"id3\"}" +
                "]}}";

        System.out.println(strRet);
        return strRet;
    }
}
