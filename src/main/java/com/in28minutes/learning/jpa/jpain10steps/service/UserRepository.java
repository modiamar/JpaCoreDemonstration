package com.in28minutes.learning.jpa.jpain10steps.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;

public interface UserRepository extends JpaRepository<User, Long > {
	//Jpa repository already has CRUD implementations and all you have to do is pass in an object
	// Commmon abstraction
}
