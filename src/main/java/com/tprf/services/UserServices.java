package com.tprf.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tprf.dao.UserRepository;
import com.tprf.model.User;

@Service
public class UserServices {
	
	@Autowired
	UserRepository userRepository;
	
	
	
	public void createUser(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + user.getEmail());
		userRepository.save(user);
	}
	
	public User getUser(String firstName) {
		return userRepository.findByFirstName(firstName);
	}

}
