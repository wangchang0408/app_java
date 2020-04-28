package com.springcloud.service_caller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient //允许注册到注册中心
@EnableFeignClients //允许服务调用
public class ServiceCallerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceCallerApplication.class, args);
	}

}
