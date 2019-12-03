package com.gu.provider.service;

import com.gu.provider.LoginApi;
import com.gu.provider.entity.User;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

@Service(version = "1.0.0")
public class LoginApiImpl implements LoginApi {
    @Override
    public List getId() {
        ArrayList arrayList = new ArrayList();
        User user = new User();
        user.setId(1);
        user.setUsername("东风");
        user.setPassword("123");
        arrayList.add(user);
        return arrayList;
    }
}
