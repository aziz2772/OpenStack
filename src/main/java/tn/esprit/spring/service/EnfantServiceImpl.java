package tn.esprit.spring.service;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import tn.esprit.spring.entity.Enfant;
import tn.esprit.spring.repo.EnfantRepository;

@Service
public class EnfantServiceImpl implements EnfantService {

	@Autowired
	EnfantRepository enfantRepository;
	
	@Override
	public List<Enfant> retrieveAllEnfant() {
		return (List<Enfant>) enfantRepository.findAll() ;
	}

	
	@Override
	public Enfant addEnfant(Enfant e) {
    enfantRepository.save(e) ;
		return e;
	}

	@Override
	public void deleteEnfant(String id) {
		enfantRepository.deleteById(Integer.parseInt(id));
		
	}

	@Override
	public Enfant updateEnfant(Enfant e) {
		enfantRepository.save(e) ;
		return e;
	}

	@Override
	public Enfant retrieveEnfant(String id) {
		return	enfantRepository.findById(Integer.parseInt(id)).orElse(null);
	}



	@Override
	public List<Enfant> Search(String word) {
		return (List<Enfant>) enfantRepository.searchEnfant(word);
	}


	@Override
	public int getnbEnfant() {
		return enfantRepository.getNombresEnfant();
	}


	@Override
	public int getnbG() {
		return enfantRepository.getNombresGarçon();
	}
	
	@Override
	public int getnbF() {
		return enfantRepository.getNombresFille();
	}

	

	
	
}
