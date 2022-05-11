package tn.esprit.spring.service;

import java.util.List;

import org.hibernate.usertype.UserType;

import tn.esprit.spring.entities.Jardin;

public interface JardinService {

		Jardin saveJardin(Jardin jard);
		Jardin updateJardin(Jardin jard);
		void deleteJardin(Jardin jard);
		void deleteJardinById(Long id);
		Jardin getJardin(Long id);
		List <Jardin> getAllJardins();
		Jardin ajouterJardin(Jardin jard);
		Jardin selectjardinbyId(UserType user);
		
}
