package com.springboot.app.controller;

import java.util.List;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.client.BankAccountClient;
import com.springboot.app.entity.Item;

@RestController 
@RequestMapping("/booking") 
public class BankingController { 

	@Autowired 
	BankAccountClient account; 

	@GetMapping("/checkCardNumber/{cardNumber}") 
	public boolean checkCardNumber(@PathVariable Long cardNumber) { 
		return account.checkCardNumber(cardNumber); 
	} 




} 





