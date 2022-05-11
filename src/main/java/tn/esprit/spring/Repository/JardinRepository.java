package tn.esprit.spring.Repository;

import org.hibernate.usertype.UserType;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



import tn.esprit.spring.entities.Jardin;

public interface JardinRepository extends JpaRepository<Jardin, Long> {
	
	@Query("SELECT k FROM Jardin k where k.directeur_id=:user or k.responsable_garderie=:user or k.medecin_id=:user")
	public Jardin selectjardinbyId(@Param("user") UserType u);

}
