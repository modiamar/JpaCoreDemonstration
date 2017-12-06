package com.in28minutes.learning.jpa.jpain10steps.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learning.jpa.jpain10steps.service.UserDAOService;
import com.in28minutes.learning.jpa.jpain10steps.service.UserDaoServiceCommandLineRunner;

@Component
public class DogRunner  implements CommandLineRunner {

	

	private static final Logger log = 
			LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	private DogDAOService dogDaoService;
	
	
	@Override
	public void run(String... args) throws Exception {
		Dog dog = new Dog("Woof", "floor");
		dogDaoService.insertDog(dog);
		log.info("New user is created: " + dog);
		
	}

}
