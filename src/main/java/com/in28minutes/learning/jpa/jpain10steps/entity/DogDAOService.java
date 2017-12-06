package com.in28minutes.learning.jpa.jpain10steps.entity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class DogDAOService {

	@PersistenceContext
	//This is the persistence manager //Autowired
	private EntityManager entityManager;
	
	public long insertDog(Dog dog){
		entityManager.persist(dog);
		return dog.getId();
	}
}
