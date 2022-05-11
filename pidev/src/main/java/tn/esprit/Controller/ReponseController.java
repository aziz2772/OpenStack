package tn.esprit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



import tn.esprit.entities.Forum;
import tn.esprit.entities.Sujet;
import tn.esprit.repository.*;
import tn.esprit.services.SujetServicesImpl;
import tn.esprit.services.ForumServicesImpl;
import tn.esprit.services.ReponseServiceImpl;
import tn.esprit.entities.Reponse;

@RestController
public class ReponseController {
	
	@Autowired
	ReponseServiceImpl reponseService;
	
	@Autowired
	SujetServicesImpl sujetserviceImpl;
	
	@PostMapping("/forum/{forum_id}/sujets/{sujet_id}/reponses/add-reponse")
	@ResponseBody
	public Reponse ajouterReponse(@PathVariable("forum_id") int forum_id,@PathVariable("sujet_id")int sujet_id,@RequestBody Reponse reponse) {
		reponseService.affecterReponseToSujet(sujet_id, reponse);
		return reponse;
	}
	@GetMapping("/forum/{forum_id}/sujets/{sujet_id}/reponses")
	public List<Reponse> getAllReponsesBySujet(@PathVariable("forum_id") int forum_id, @PathVariable("sujet_id") int sujet_id){
		return reponseService.Allreponseinsujet(sujet_id);
	}
	
	@PutMapping("/forum/{forum_id}/sujets/{sujet_id}/reponses/add-reponse")
	@ResponseBody
	public Reponse modifierReponse(@PathVariable("forum_id") int forum_id,@PathVariable("sujet_id")int sujet_id,@RequestBody Reponse reponse) {
		reponseService.affecterReponseToSujet(sujet_id, reponse);
		return reponse;
	}
	


	@GetMapping("/get-reponses")
	public List<Reponse> getAllReponses(){
		return reponseService.getAllReponses();
	}
	
	
	@GetMapping("/reponses/{reponse_id}")
	public Reponse getReponseById(@PathVariable("reponse_id") int reponse_id) {
		return reponseService.getReponseById(reponse_id);		
	}
	

	@DeleteMapping("/reponses/{reponse_id}")
	public void deleteReponse(@PathVariable("reponse_id") int reponse_id) {
		reponseService.suppReponse(reponse_id);
	}
}
