package com.springboot.app.batchprocessing;

import org.springframework.batch.item.ItemProcessor;

import com.springboot.app.entity.Item;

public class MenuItemProcessor implements ItemProcessor<Item ,Item>{ 
	 
	@Override 
 	  public Item process(final Item item) throws Exception { 
 		final String resturantname = item.getRestaurantname(); 
 	    final String itemcode = item.getItemcode();	     
 	    final String itemname = item.getItemname(); 
 	    final double priceperunit = item.getPriceperitem(); 
 	     
 
 	    final Item processedItem = new Item(1L,resturantname,itemcode,itemname, priceperunit); 
 	    return processedItem; 
 	  } 
 
 } 

