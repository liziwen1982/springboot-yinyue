package com.wenxing.yinyue.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class login {
    @GetMapping("/login/cellphone")
    public String loginCellphone(@RequestParam(name = "phone", defaultValue = "") String phone,
                                 @RequestParam(name = "password", defaultValue = "") String password,
                                 HttpServletResponse response){
        System.out.println("phone:" + phone + "\npassword:" + password);

        String code = "0";
        if(!Objects.equals(phone, "18501010101"))
            code = "400";
        else if(!Objects.equals(password, "abc"))
            code = "502";
        else
            code = "200";

        String strRet = STR."{\"code\":\{code},\"profile\":{\"msg\":\"profilemsg\", \"avatarUrl\":\"http://192.168.66.13/wechat/1.jpg\", \"nickname\":\"至尊宝\", \"userId\":\"1234512345\"}}";

        System.out.println(strRet);

        Cookie myCookie = new Cookie("cookie1", "1");
        // 设置Cookie的属性，如路径、域、有效期等
        myCookie.setPath("/");
        myCookie.setMaxAge(3600); // 设置为1小时（3600秒）
        response.addCookie(myCookie);

        myCookie = new Cookie("cookie2", "2");
        // 设置Cookie的属性，如路径、域、有效期等
        myCookie.setPath("/");
        myCookie.setMaxAge(3600); // 设置为1小时（3600秒）
        response.addCookie(myCookie);

        myCookie = new Cookie("cookie3", "3");
        // 设置Cookie的属性，如路径、域、有效期等
        myCookie.setPath("/");
        myCookie.setMaxAge(3600); // 设置为1小时（3600秒）
        response.addCookie(myCookie);

        myCookie = new Cookie("cookie4", "4");
        // 设置Cookie的属性，如路径、域、有效期等
        myCookie.setPath("/");
        myCookie.setMaxAge(3600); // 设置为1小时（3600秒）
        response.addCookie(myCookie);

        return strRet;
    }
}
