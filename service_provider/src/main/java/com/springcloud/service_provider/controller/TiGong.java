package com.springcloud.service_provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangchang
 * @date 2020/3/27 16:49
 */
@Controller
public class TiGong {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "hello";
    }
}
