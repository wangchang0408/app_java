package com.maple.app_demo.controller;

import com.maple.app_demo.entity.UserInfo;
import com.maple.app_demo.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author wangchang
 * @date 2020/4/22 14:47
 */
@Slf4j //这里是lombok里面的注解
@RestController
@RequestMapping("/user")
public class UserInfoController {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(UserInfoController.class);
    @Autowired
    private UserInfoService userInfoService;

    /**
     * 注册
     * @param map
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public UserInfo register(@RequestBody Map map) {
        UserInfo user = new UserInfo();
        user.setUsername(map.get("userName").toString());
        user.setPassword(map.get("password").toString());
        log.info(user.getUsername() + "," + user.getPassword());
        return userInfoService.register(user);
    }

    /**
     * 登录
     * @param map
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public UserInfo login(@RequestBody Map map) {
        UserInfo user = new UserInfo();
        user.setUsername(map.get("userName").toString());
        user.setPassword(map.get("password").toString());
        System.out.println(user.getUsername() + "," + user.getPassword());
        return userInfoService.login(user);
    }
}

