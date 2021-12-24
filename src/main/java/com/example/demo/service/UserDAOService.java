package com.example.demo.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
@Transactional
public class UserDAOService {
	/*
	 * User jack =  new User("Jack", "Admin");
	 * User jill =  new User("Jill", "Admin"):
	 * 
	 * entityManager.persist(jack):
	 * 
	 * - PERSIST CONTECT -
	 * jack.sertRole("User");
	 * jill.setRoll("User");
	 * */
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User user) {
		//Open Transaction
		entityManager.persist(user);
		//Close Transaction
		return user.getId();
	}
}
