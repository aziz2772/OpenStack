package esprit.pi.kidzone.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import esprit.pi.kidzone.entities.Rendez_vous;
import esprit.pi.kidzone.repos.RdvRepository;

@Service
public class RdvServiceImpl implements RdvService {
	@Autowired
	RdvRepository rdvRepository;

	@Override
	public Rendez_vous saveRendez_vous(Rendez_vous rdv) {
		
		return rdvRepository.save(rdv);
	}

	@Override
	public Rendez_vous updateRendez_vous(Rendez_vous rdv) {
		
		return rdvRepository.save(rdv);
	}

	@Override
	public void deleteRendez_vous(Rendez_vous rdv) {
		 rdvRepository.delete(rdv);
		
	}

	@Override
	public void deleteRendez_vousById(Long id) {
		rdvRepository.deleteById(id);
		
	}

	@Override
	public Rendez_vous getRendez_vous(Long id) {
		
		return rdvRepository.findById(id).get();
	}

	@Override
	public List<Rendez_vous> getAllRendez_vous() {
		
		return rdvRepository.findAll();
	}

	
}
