package com.springboot.service.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.entity.BankAccount;
import com.springboot.service.entity.Transaction;
import com.springboot.service.exception.AccountNotFoundException;
import com.springboot.service.exception.DBException;
import com.springboot.service.repository.BankAccountRepository;
import com.springboot.service.repository.TransactionRepository;


@RestController 
@RequestMapping("/banking") 
public class BankAccountController { 

	@Autowired 
	private BankAccountRepository repository; 

	@Autowired 
	private TransactionRepository transrepository;


	@GetMapping("/getAllUsers") 
	public List<BankAccount> getAllUsers(){ 
		return repository.findAll(); 


	} 
	@GetMapping("/user/{id}") 
	public Optional<BankAccount> getUserByAccount(@PathVariable Long id)throws AccountNotFoundException{ 
		return repository.findById(id); 


	} 
	@PostMapping("/registerUser") 
	public BankAccount registerUser(@RequestBody BankAccount user) throws DBException {		 
		BankAccount savedAccount = repository.save(user); 
		return savedAccount;		 
	} 

	@GetMapping("/getTransactions") 
	public List<Transaction> getTransactions(){ 
		return transrepository.findAll(); 
	}

	@PostMapping("/makeTransaction") 
	public Transaction makeTransaction(@RequestBody Transaction trans){		 
		Transaction transaction = transrepository.save(trans); 
		return transaction;		 
	} 

	@GetMapping("/lastTransactions/{accountnumber}/{numberoftransactions}") 
	public List<Transaction> getLastTransactions(@PathVariable Long accountnumber, @PathVariable int numberoftransactions){ 
		return null; 
	} 

	@GetMapping("transStatement/{accountnumber}") 
	public List<Transaction> getStatement(@PathVariable Long accountNumber){		 
		return null;		 
	} 


}

