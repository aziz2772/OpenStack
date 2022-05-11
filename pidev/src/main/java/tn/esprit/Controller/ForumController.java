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
import tn.esprit.services.ForumServicesImpl;
import tn.esprit.services.SujetServicesImpl;

@RestController
public class ForumController {
	
	@Autowired
	ForumServicesImpl ForumServiceImpl;

	@Autowired
	SujetServicesImpl sujetserviceImpl;
	
	
	@PostMapping("/addForum")
	@ResponseBody
	public Forum ajouterForum(@RequestBody Forum forum) {
		ForumServiceImpl.AjouterForum(forum);
		return forum;
	}
	@GetMapping("/forums")
	public List<Forum> getAllForum(){
		return ForumServiceImpl.getAllForum();
	}
	@GetMapping("/forum/{forum_id}")
	public Forum getForumById(@PathVariable("forum_id") int forum_id) {
		return ForumServiceImpl.getForum(forum_id);
		
	}
	
	@DeleteMapping("/forum/{forum_id}")
	public void deleteForum(@PathVariable("forum_id") int forum_id) {
		ForumServiceImpl.deleteForumById(forum_id);
	}
	
	@PutMapping("/updateforum")
	public Forum updateForum(@RequestBody Forum forum) {
		ForumServiceImpl.updateForum(forum);
		return forum;
	}
	@GetMapping("/Recherche/{nomforum}")
	@ResponseBody
	public List<Forum> findBynomforum(@PathVariable("nomforum") String nomforum) {
		return ForumServiceImpl.findBynomforum(nomforum);
}
}