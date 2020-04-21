package com.springboot.service.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	private Long fromaccount; 
	private Long toaccount; 
	private Double amounttransfered; 
	private Date dateoftransfer;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getFromaccount() {
		return fromaccount;
	}
	public void setFromaccount(Long fromacct) {
		this.fromaccount = fromaccount;
	}
	public Long getToaccount() {
		return toaccount;
	}
	public void setToaccount(Long toaccount) {
		this.toaccount = toaccount;
	}
	public Double getAmounttransfered() {
		return amounttransfered;
	}
	public void setAmounttransfered(Double amounttransfered) {
		this.amounttransfered = amounttransfered;
	}
	public Date getDateoftransfer() {
		return dateoftransfer;
	}
	public void setDateoftransfer(Date dateoftransfer) {
		this.dateoftransfer = dateoftransfer;
	}
	 
	

}
