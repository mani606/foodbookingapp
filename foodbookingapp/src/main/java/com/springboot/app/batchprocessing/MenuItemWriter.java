package com.springboot.app.batchprocessing;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.springboot.app.entity.Item;




public class MenuItemWriter implements ItemWriter<Item> { 

 
 	public void write(List<? extends Item> items) throws Exception { 
 		items.forEach(System.out::print); 
 	} 
}