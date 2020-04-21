package com.springboot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.entity.UserReg;

public interface RegRepository extends JpaRepository<UserReg, Long> {

}
