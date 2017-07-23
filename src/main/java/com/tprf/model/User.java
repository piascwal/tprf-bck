package com.tprf.model;

public class User {
	
	private  int id;
	private  String firstName;
	private  String lastName;
	private  String email;
	
	
	public User() {
		super();
	}


	public User(int id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	
	public long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	
	
}
