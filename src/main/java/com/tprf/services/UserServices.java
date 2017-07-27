package com.tprf.services;

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
	public void createUser(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + user.getEmail());
		user= userRepository.save(user);
		System.out.println(user.getId());
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

}
