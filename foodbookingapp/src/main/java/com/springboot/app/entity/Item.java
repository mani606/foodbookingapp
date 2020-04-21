package com.springboot.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	private String restaurantname; 
	private String itemname; 
	private String itemcode; 
	private double priceperitem;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getItemcode() {
		return itemcode;
	}
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}
	public double getPriceperitem() {
		return priceperitem;
	}
	public void setPriceperitem(double priceperitem) {
		this.priceperitem = priceperitem;
	}
	public Item() {
		super();
	}
	public Item(Long id, String restaurantname, String itemname, String itemcode, double priceperitem) {
		super();
		this.id = id;
		this.restaurantname = restaurantname;
		this.itemname = itemname;
		this.itemcode = itemcode;
		this.priceperitem = priceperitem;
	}

}
