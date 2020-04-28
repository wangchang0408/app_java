package com.maple.app_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.maple.app_demo.dao")
public class AppDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppDemoApplication.class, args);
	}

}
