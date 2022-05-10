package esprit.pi.kidzone.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import esprit.pi.kidzone.entities.Rendez_vous;
@Repository
public interface RdvRepository extends JpaRepository<Rendez_vous, Long> {
	

}
