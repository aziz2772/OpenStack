package esprit.pi.kidzone.service;

import java.util.List;


import esprit.pi.kidzone.entities.Rendez_vous;

public interface RdvService {
	
	Rendez_vous saveRendez_vous(Rendez_vous rdv);
	Rendez_vous updateRendez_vous(Rendez_vous rdv);
	void deleteRendez_vous(Rendez_vous rdv);
	void deleteRendez_vousById(Long id);
	Rendez_vous getRendez_vous(Long id);
	List <Rendez_vous> getAllRendez_vous();
	
	

}
