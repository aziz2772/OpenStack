package tn.esprit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;



import tn.esprit.entities.Sujet;
import tn.esprit.services.*;

@Repository
public interface SujetRepository extends CrudRepository<Sujet,Integer>{

	List<Sujet> findAllByForumId(int forum_id);
	@Query("SELECT count(*) as nbr FROM Sujet")
	int getNombresSujet();
}
