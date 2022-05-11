package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import tn.esprit.spring.entity.Consultation;
import tn.esprit.spring.service.ConsultationService;

@RestController
@Api(tags = "Gestion des consultations")
@RequestMapping("/Consultation")
public class ConsultationController {

	@Autowired
	ConsultationService ConsultationService;
	
	// http://localhost:8070/Consultation/retrieveAllConsultation
	@GetMapping("/retrieveAllConsultation")
	@ResponseBody
	public List<Consultation> getAllConsultations( ) {
		return ConsultationService.retrieveAllConsultation();
		}
	
	// http://localhost:8070/Consultation/retrieve-Consultation/{Consultation-id}
	@GetMapping("/retrieve-Consultation/{Consultation-id}")
	@ResponseBody
	public Consultation retrieveConsultation(@PathVariable("Consultation-id") String ConsultationId) {
	return ConsultationService.retrieveConsultation(ConsultationId);
	} 
	

	
	// http://localhost:8070/Consultation/Enfant/{enfant_id}/add-consultation
	@PostMapping("/Enfant/{enfant_id}/add-consultation")
	@ResponseBody
	public Consultation addConsultation(@PathVariable("enfant_id") int enfant_id ,@RequestBody Consultation c) {
	ConsultationService.affecterConsultationToEnfant(enfant_id, c);
	return c;
	}
	
	
	// http://localhost:8070/Consultation/remove-Consultation/{Consultation-id}
	@DeleteMapping("/remove-Consultation/{Consultation-id}")
	@ResponseBody
	public void deleteConsultation(@PathVariable("Consultation-id") String ConsultationId) {
	ConsultationService.deleteConsultation(ConsultationId);
	}

	// http://localhost:8070/Consultation/modify-Consultation
	@PutMapping("/modify-Consultation")
	@ResponseBody
	public Consultation updateConsultation(@RequestBody Consultation Consultation) {
	return ConsultationService.updateConsultation(Consultation);
	}
	
	// http://localhost:8070/Consultation/NbreConsultation
	@GetMapping("/NbreConsultation")
	@ResponseBody
	public int getNombreConsultation() {
		return ConsultationService.getnbConsultation();
	}	
	
	// http://localhost:8070/Consultation/Recherche/{maladie}
	@GetMapping("/recherche/{nomenfant}")
	@ResponseBody
	public List<Consultation> findByConsByMaladie(@PathVariable("maladie") String maladie) {
		return ConsultationService.Search(maladie);
	}
	/*
	// http://localhost:8070/Consultation/{id_enfant}/NbreConsultation
	@GetMapping("{id_enfant}/NbreConsultation")
	@ResponseBody
	public int NombreConsultationEnfant(@PathVariable("id_enfant") String idenfant) {
		return ConsultationService.getnbConsultationByEnfant(idenfant);
	}
	*/
	
 
}
