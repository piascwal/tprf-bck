package com.tprf.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.tprf.model.Categorie;

@RepositoryRestResource(collectionResourceRel = "categories", path = "categories")
public interface CategorieRepository extends PagingAndSortingRepository<Categorie, Long> {
	List<Categorie> findByLibelle(@Param("libelle") String libelle);
	
}
