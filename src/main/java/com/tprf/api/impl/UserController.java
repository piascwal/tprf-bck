package com.tprf.api.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tprf.model.User;
import com.tprf.services.UserServices;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/users")
public class UserController {
	
	@Autowired
	UserServices userService;
	
	
	@RequestMapping(value="/{userId}", method=RequestMethod.GET)
	public User getUser(@PathVariable Long userId)  {
		return userService.getUser(userId);
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public User createUser(@RequestBody User user)  {
		return userService.createUser(user);
	}
	
	@RequestMapping(value="/{userId}", method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable Long userId)  {
		System.out.println(userId);
		userService.deleteUser(userId);
	}
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<User> getAllUser()  {
		return (List<User>) userService.getUser();
		
	}
}
