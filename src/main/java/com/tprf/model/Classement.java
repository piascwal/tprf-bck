package com.tprf.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



public class Classement {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	Long id;

}
