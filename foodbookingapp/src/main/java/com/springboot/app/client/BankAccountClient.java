package com.springboot.app.client;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.app.entity.Item;

@FeignClient(name="api-gateway-service") 
@RibbonClient(name = "banking-service") 

public interface BankAccountClient {

	
	boolean checkCardNumber(Long cardNumber);
	@RequestMapping(value = "/item",method =RequestMethod.POST,consumes = "application/json") 
	Item doPayment(@RequestBody  Item it);

	
	


}
