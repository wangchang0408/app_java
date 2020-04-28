package com.springcloud.service_caller.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangchang
 * @date 2020/3/27 16:52
 * @Description 调用service_provider的SayHello类的方法
 */
@FeignClient(value = "serprovider") //调用的服务名称
public interface DiaoYong {
    @RequestMapping("/hello")
    public String sayHello();
}
