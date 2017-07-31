package com.tprf.repository;

import org.springframework.data.repository.CrudRepository;

import com.tprf.model.Classement;


public interface ClassementRepository extends CrudRepository<Classement, Long> {
	Classement findById(Long classementId);
	

}
