package com.springboot.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.service.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
