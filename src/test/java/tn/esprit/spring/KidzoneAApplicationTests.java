package tn.esprit.spring;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.Repository.EvenementRepository;
import tn.esprit.spring.Repository.JardinRepository;
import tn.esprit.spring.entities.Evenement;
import tn.esprit.spring.entities.Jardin;

@SpringBootTest
class KidzoneAApplicationTests {
	
	@Autowired 
	private JardinRepository jardinRepository;
	
	@Autowired 
	private EvenementRepository evenementRepository;
	
	@Test
	public void testCreateJardin () {
		Jardin jard = new Jardin ("Ariana",500,"kidzone","xx",23546892,20,2,3,3);
		jardinRepository.save(jard);
	
	}
	
	@Test
	public void testCreateEvent () {
		Evenement event = new Evenement ("AAMIRADHOUEN","kidzoneevent",new Date(),new Date(),"Ariana");
		evenementRepository.save(event);
	}
	
	
	@Test
	public void testFindJardin() {
		
		Jardin jard = jardinRepository.findById(1L).get();
		System.out.println(jard);	
	}
	
	@Test
	public void testFindEvenement() {
		
		Evenement event = evenementRepository.findById(1L).get();
		System.out.println(event);	
	}
	
	@Test
	public void testUpdateJardin() {
		
		Jardin jard = jardinRepository.findById(1L).get();
		jard.setCapacite(1000);
		jardinRepository.save(jard);
		System.out.println(jard);
	}
	
	@Test
	public void testUpdateEvenement() {
		
		Evenement event = evenementRepository.findById(1L).get();
		event.setNom_event("TESTUPDATEMEHDI");
		evenementRepository.save(event);
		System.out.println(event);
	}
	
	@Test
	public void testDeleteJardin() {
		
		jardinRepository.deleteById(1L);
	}
	
	@Test
	public void testDeleteEvenement() {
		
		evenementRepository.deleteById(1L);
	}
	
	@Test
	public void testListerTousJardins() {
		
		List <Jardin> jards = jardinRepository.findAll();
		
		for (Jardin jard:jards) {
			System.out.println(jard);
		}
	}
	
	@Test
	public void testListerTousEvenements() {
		
		List <Evenement> events = evenementRepository.findAll();
		
		for (Evenement event:events) {
			System.out.println(event);
		}
	}
	
}
