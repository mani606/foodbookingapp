package com.springboot.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.service.entity.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount,Long> {

}
