package com.tprf.api.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tprf.model.User;
import com.tprf.services.UserServices;

@RestController
@RequestMapping(value="/users")
public class UserController {
	
	@Autowired
	UserServices userService;
	
	
	@RequestMapping(value="/{userId}", method=RequestMethod.GET)
	public User getUser(@PathVariable Long userId)  {
		return userService.getUser(userId);
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void createUser(@RequestBody User user)  {
		userService.createUser(user);
	}
	
	@RequestMapping(value="/{userId}", method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable Long userId)  {
		userService.deleteUser(userId);
	}
}
