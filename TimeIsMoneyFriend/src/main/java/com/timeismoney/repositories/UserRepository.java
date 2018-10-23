package com.timeismoney.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timeismoney.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String username);

}
