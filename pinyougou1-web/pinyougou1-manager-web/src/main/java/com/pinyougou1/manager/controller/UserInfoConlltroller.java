package com.pinyougou1.manager.controller;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserInfoConlltroller {
    @GetMapping("/showUserName")
    public Map<String,Object> findUserName(){
        //获取当前线程的上下文对象
        SecurityContext context = SecurityContextHolder.getContext();
        //获取里面的认证器
        Authentication authentication = context.getAuthentication();
        //从认证器获取名字
        String name = authentication.getName();
        //放到map里面
        HashMap<String,Object> map = new HashMap<>();
        map.put("username",name);
        return map;
    }
}
