package com.springcloud.service_caller.controller;

import com.springcloud.service_caller.feignclient.DiaoYong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangchang
 * @date 2020/3/27 16:57
 */
@Controller
public class TestDemo {
    @Autowired
    private DiaoYong diaoYong;
    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
        return diaoYong.sayHello();
    }
}
