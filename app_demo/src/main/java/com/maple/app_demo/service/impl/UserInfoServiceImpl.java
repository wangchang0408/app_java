package com.maple.app_demo.service.impl;

import com.maple.app_demo.dao.UserInfoMapper;
import com.maple.app_demo.entity.UserInfo;
import com.maple.app_demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangchang
 * @date 2020/4/22 14:51
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;


    /**
     * 注册
     * @param user
     * @return
     */
    @Override
    public UserInfo register(UserInfo user) {
        UserInfo result=new UserInfo();
        result.setSuccess(false);
        UserInfo existUser=userInfoMapper.findUserNameByName(user.getUsername());
        try
        {
            if (existUser !=null){
                result.setMsg("用户名已存在！");
            }
            else {
                userInfoMapper.regist(user);
                result.setMsg("注册成功");
                result.setSuccess(true);
            }
        } catch (Exception e){
            e.printStackTrace();
            result.setMsg(e.getMessage());
        }
        return result;
    }

    /**
     * 登录
     * @param user
     * @return
     */
    @Override
    public UserInfo login(UserInfo user) {
        UserInfo result=new UserInfo();
        result.setSuccess(false);
        Long userId= userInfoMapper.login(user);
        try
        {
            if (userId == null){
                result.setMsg("用户名或密码不正确");
            }
            else {
                result.setMsg("登录成功！");
                result.setSuccess(true);
            }
        } catch (Exception e){
            e.getStackTrace();
            result.setMsg(e.getMessage());

        }
        return result;
    }
}
