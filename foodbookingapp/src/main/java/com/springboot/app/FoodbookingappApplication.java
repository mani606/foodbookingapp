package com.springboot.app;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.springboot.app.config.RibbonConfiguration;

@SpringBootApplication
@EnableEurekaClient
@EnableBatchProcessing
@EnableZuulProxy
@EnableFeignClients
@RibbonClient(name="banking-service",configuration=RibbonConfiguration.class)
public class FoodbookingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodbookingappApplication.class, args);
	}

}
