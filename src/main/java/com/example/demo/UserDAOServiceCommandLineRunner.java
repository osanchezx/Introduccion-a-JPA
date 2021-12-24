package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.service.UserDAOService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDAOService;
	
	@Override
	public void run(String... arg0) throws Exception{
		User user = new User("Jack", "Admin");
		long insert = userDAOService.insert(user);
		log.info("Nuevo usuario creado "+ user);
	}
}
