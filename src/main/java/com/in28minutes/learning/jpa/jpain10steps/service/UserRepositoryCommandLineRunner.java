package com.in28minutes.learning.jpa.jpain10steps.service;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	private static final Logger log = 
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Bob","Admin");
		//update and insert are the same method
		//userRepository.save(user);
		Optional<User> userWithId1 = userRepository.findById(1L);
		List<User> findAll = userRepository.findAll();
		log.info("New user is created: " + user);
		
		
	}

}
