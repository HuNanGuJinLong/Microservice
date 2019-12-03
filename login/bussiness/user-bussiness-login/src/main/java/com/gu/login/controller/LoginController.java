package com.gu.login.controller;

import com.gu.provider.LoginApi;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class LoginController {

    @Reference
    private LoginApi loginApi;

    @GetMapping("list")
    public List getList(){
        List id = loginApi.getId();
        if (null!=id){
            return id;
        }
        return null;
    }
}
