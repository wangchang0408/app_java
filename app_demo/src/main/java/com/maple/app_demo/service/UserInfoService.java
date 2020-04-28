package com.maple.app_demo.service;

import com.maple.app_demo.entity.UserInfo;
import org.springframework.stereotype.Service;

/**
 * @author wangchang
 * @date 2020/4/22 14:48
 */
public interface UserInfoService {
    //注册
    UserInfo register(UserInfo user);

    //登录
    UserInfo login(UserInfo user);
}
