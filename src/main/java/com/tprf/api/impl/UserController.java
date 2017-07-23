package com.tprf.api.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tprf.model.User;

@RestController
public class UserController {
	
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public User getUser(@RequestParam(value="id") int id)  {
		return new User(id, "Pierre", "Dupont", "pierre-dupont@gmail.com");
		
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public void createUser(@RequestBody User user)  {
		System.out.println(user.getId() + user.getFirstName() + user.getLastName() + user.getEmail());
			
	}
}
