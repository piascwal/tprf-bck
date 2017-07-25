package com.tprf.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tprf.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	User findByFirstName(String firstName);

	List<User> findByLastName(String lastName);
}
