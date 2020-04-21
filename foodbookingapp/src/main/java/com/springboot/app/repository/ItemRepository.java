package com.springboot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
