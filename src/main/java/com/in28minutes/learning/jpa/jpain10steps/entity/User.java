package com.in28minutes.learning.jpa.jpain10steps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/// Store to table in the db
// Create as Entity
@Entity
public class User {
	
	//Primary Key
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	private String role;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User( String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	
	public User(){
		
	}
	
	@Override
	public String toString() {
		return String.format("User [id=%s, name=%s, role=%s]", id, name, role);
	}
	
	
	

}
