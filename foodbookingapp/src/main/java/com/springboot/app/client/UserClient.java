package com.springboot.app.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.app.entity.Item;

@FeignClient(name="") 
public interface UserClient {

 	@RequestMapping(value = "/item",method =RequestMethod.POST,consumes = "application/json") 
 	Item doPayment(@RequestBody  Item it);

	static List<Item> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	static List<Item> getAllById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	static String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
