package com.tprf.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tprf.model.User;
import com.tprf.repository.UserRepository;

/**
 * Service permettant la gestion des Utilisateurs
 * @author mpiasco
 *
 */
@Service
public class UserServices {
	
	@Autowired
	UserRepository userRepository;
	
	/**
	 * Création d'un utilisateur
	 * @param user
	 */
	public User createUser(User user) {
		 return user = userRepository.save(user);
	}
	
	/**
	 * Récupération d'un utilisateur à l'aide de son identifiant
	 * @param userId
	 * @return
	 */
	public User getUser(Long userId) {
		return userRepository.findById(userId);
	}
	
	/**
	 * Suppression d'un utilisateur à l'aide de son identifiant
	 * @param userId
	 */
	public void deleteUser(Long userId) {
		userRepository.delete(userId);
	}
	
	/**
	 * Récupération de tous les utilisateurs
	 * @return
	 */
	public Iterable<User> getUser() {
		return userRepository.findAll();
	}

}
