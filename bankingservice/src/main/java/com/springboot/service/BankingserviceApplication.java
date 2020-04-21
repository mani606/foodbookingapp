package com.springboot.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableEurekaClient
//@EnableFeignClients
//@RibbonClient(name="banking-service",configuration=RibbonConfiguration.class)
public class BankingserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingserviceApplication.class, args);
	}

}
