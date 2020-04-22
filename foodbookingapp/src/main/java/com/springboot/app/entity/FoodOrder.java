package com.springboot.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FoodOrder {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id; 
	private String restaurantname; 
	private String itemname; 
	private double priceperitem; 
	private double payeamount; 
	private Long cardnumber; 
	private Long ordernumber ;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getRestaurantname() {
		return restaurantname;
	}
	public void setRestaurantname(String restaurantname) {
		this.restaurantname = restaurantname;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public double getPriceperitem() {
		return priceperitem;
	}
	public void setPriceperitem(double priceperitem) {
		this.priceperitem = priceperitem;
	}
	public double getPayeamount() {
		return payeamount;
	}
	public void setPayeamount(double payeamount) {
		this.payeamount = payeamount;
	}
	public Long getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(Long cardnumber) {
		this.cardnumber = cardnumber;
	}
	public Long getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(Long ordernumber) {
		this.ordernumber = ordernumber;
	}
	public FoodOrder() {
		super();
	}
	public FoodOrder(Long id, String restaurantname, String itemname, double priceperitem, double payeamount,
			Long cardnumber, Long ordernumber) {
		super();
		Id = id;
		this.restaurantname = restaurantname;
		this.itemname = itemname;
		this.priceperitem = priceperitem;
		this.payeamount = payeamount;
		this.cardnumber = cardnumber;
		this.ordernumber = ordernumber;
	}

}
