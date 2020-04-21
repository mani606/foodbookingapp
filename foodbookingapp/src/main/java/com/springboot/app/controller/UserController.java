package com.springboot.app.controller;

import java.util.List;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.client.UserClient;
import com.springboot.app.entity.Item;
@RestController
@RequestMapping("/orders")
public class UserController {
	@Autowired 
	JobLauncher  launcher; 

	@Autowired 
	Job job; 

	@GetMapping("/info")
	public String getInfo() {
		return UserClient.getInfo();
	}

	@GetMapping("")
	public List<Item> getUserOrders() {

		return UserClient.getAll();

	}


	@GetMapping("/{userId}")
	public List<Item> getUserOrdersById(@PathVariable String userId) {
		return UserClient.getAllById(userId);
	}
}
