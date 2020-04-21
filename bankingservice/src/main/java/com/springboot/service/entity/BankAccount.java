package com.springboot.service.entity;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	private String firstname; 
	private String lastname; 
	private char gender;
	private Long accountnumber; 
	private Double balanceamount; 
	private Long cardnumber; 
	private Long cvvnumber; 
	private Date expirydate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lasttname) {
		this.lastname = lastname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(Long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public Double getBalanceamount() {
		return balanceamount;
	}
	public void setBalanceamount(Double balanceamount) {
		this.balanceamount = balanceamount;
	}
	public Long getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(Long cardnumber) {
		this.cardnumber = cardnumber;
	}
	public Long getCvvnumber() {
		return cvvnumber;
	}
	public void setCvvnumber(Long cvvnumber) {
		this.cvvnumber = cvvnumber;
	}
	public Date getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}
	public BankAccount() {
		super();
	}
	public BankAccount(Long id, String firstname, String lastname, char gender, Long accountnumber,
			Double balanceamount, Long cardnumber, Long cvvnumber, Date expirydate) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.accountnumber = accountnumber;
		this.balanceamount = balanceamount;
		this.cardnumber = cardnumber;
		this.cvvnumber = cvvnumber;
		this.expirydate = expirydate;
	} 

}
