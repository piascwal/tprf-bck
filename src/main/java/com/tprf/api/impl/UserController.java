package com.tprf.api.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tprf.model.User;
import com.tprf.services.UserServices;

@RestController
public class UserController {
	
	@Autowired
	UserServices userService;
	
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public User getUser(@RequestParam(value="firstname") String firstName)  {
		return userService.getUser(firstName);
		
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public void createUser(@RequestBody User user)  {
		userService.createUser(user);
	}
}
