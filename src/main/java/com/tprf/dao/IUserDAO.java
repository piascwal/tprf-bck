package com.tprf.dao;

import java.util.ArrayList;

import com.tprf.model.User;

public interface IUserDAO {
	
	public User getUser(int id);
	
	public ArrayList<User> getUsers();
	
	public void createUser(User user);

}
