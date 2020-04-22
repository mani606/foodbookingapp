package com.springboot.service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.service.entity.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount,Long> {
	@Query(value = "select * from bank_account where cardnumber =?1, nativeQuery = true")
	Optional<BankAccount> findByCardNumber(Long cardnumber);
}
