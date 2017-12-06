package com.in28minutes.learning.jpa.jpain10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;


///Indicates something that interacts with the DB
@Repository
// Each method is involved in a DB persistence transaction
@Transactional
public class UserDAOService {

	@PersistenceContext
	//This is the persistence manager //Autowired
	private EntityManager entityManager;
	
	public long insert(User user){
		
		// This persists the object
		entityManager.persist(user);
		return user.getId();
	}
	
}
