package com.tprf.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tprf.model.Classement;
import com.tprf.repository.ClassementRepository;

@Service
public class ClassementService {
	
	@Autowired
	ClassementRepository classementRepository;

	public Classement getClassement(Long classementId) {
		return classementRepository.findById(classementId);
	}

	public Classement createClassement(Classement user) {
		return classementRepository.save(user);
	}

	public void deleteClassement(Long classementId) {
		classementRepository.delete(classementId);
		
	}

	public Iterable<Classement> getClassement() {
		return classementRepository.findAll();
	}

}
