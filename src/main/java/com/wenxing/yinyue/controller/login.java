package com.wenxing.yinyue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class login {
    @GetMapping("/login/cellphone")
    public String loginCellphone(@RequestParam(name = "phone", defaultValue = "") String phone,
                                 @RequestParam(name = "password", defaultValue = "") String password){
        System.out.println("phone:" + phone + "\npassword:" + password);

        String code = "0";
        if(!Objects.equals(phone, "18501010101"))
            code = "400";
        else if(!Objects.equals(password, "abc"))
            code = "502";
        else
            code = "200";

        String strRet = STR."{\"code\":\{code},\"profile\":{\"msg\":\"profilemsg\", \"avatarUrl\":\"http://127.0.0.1/abc.png\", \"nickname\":\"至尊宝\"}}";

        System.out.println(strRet);
        return strRet;
    }
}
