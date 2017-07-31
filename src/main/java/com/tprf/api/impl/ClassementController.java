package com.tprf.api.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tprf.model.Classement;
import com.tprf.services.ClassementService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/classements")
public class ClassementController {
	
	@Autowired
	ClassementService classementService;
	
	
	@RequestMapping(value="/{classementId}", method=RequestMethod.GET)
	public Classement getClassement(@PathVariable Long classementId)  {
		return classementService.getClassement(classementId);
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Classement createClassement(@RequestBody Classement classement)  {
		System.out.println(classement.getTitre() + classement.getCreateur().getLastName());
		return classementService.createClassement(classement);
	}
	
	@RequestMapping(value="/{classementId}", method=RequestMethod.DELETE)
	public void deleteClassement(@PathVariable Long classementId)  {
		System.out.println(classementId);
		classementService.deleteClassement(classementId);
	}
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Classement> getAllUser()  {
		return (List<Classement>) classementService.getClassement();
		
	}
}
