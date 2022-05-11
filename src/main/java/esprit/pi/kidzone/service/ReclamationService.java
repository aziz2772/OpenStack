package esprit.pi.kidzone.service;

import java.util.List;

import org.springframework.data.domain.Page;

import esprit.pi.kidzone.entities.Reclamation;

public interface ReclamationService {
	
	Reclamation saveReclamation(Reclamation rec);
	Reclamation updateReclamation(Reclamation rec);
	void deleteReclamation(Reclamation rec);
	void deleteReclamationById(Long id);
	Reclamation getReclamation(Long id);
	List <Reclamation> getAllReclamation(String keyword );
	
	 public Page<Reclamation> listAll(int pageNum);

}
