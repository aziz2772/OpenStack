package tn.esprit.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



import tn.esprit.entities.Forum;

@Repository
public interface ForumRepository extends CrudRepository<Forum,Integer> {
	@Query("SELECT f FROM Forum f WHERE f.titre=:nomforum")
	public List<Forum> findBynomforum(@Param("nomforum") String type_forum);
}