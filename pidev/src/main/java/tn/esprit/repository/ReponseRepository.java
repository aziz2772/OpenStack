package tn.esprit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import tn.esprit.entities.*;
import tn.esprit.services.*;
@EnableJpaRepositories
@Repository
public interface ReponseRepository extends CrudRepository<Reponse,Integer>{

	List<Reponse> findAllBySujetId(int sujet_id);
	
}