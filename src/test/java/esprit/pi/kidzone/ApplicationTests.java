package esprit.pi.kidzone;

import java.util.Date;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import esprit.pi.kidzone.entities.Reclamation;
import esprit.pi.kidzone.repos.ReclamationRepository;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private ReclamationRepository reclamationRepository;
	@Test
	public void testCreateReclamation() {
		Reclamation rec = new Reclamation("mauvais",new Date(),"observé");
		reclamationRepository.save(rec);
}
	@Test
	public void testFindReclamation()
	{ Reclamation rec = reclamationRepository.findById(3L).get(); 
	System.out.println(rec);
	}
	@Test
	public void testUpdateReclamation()
	{ Reclamation rec = reclamationRepository.findById(3L).get();
	 
	reclamationRepository.save(rec);
	System.out.println(rec);
	}
    @Test
	public void testDeleteReclamation()
	{
	reclamationRepository.deleteById(2L);
	
	}
		@Test
	public void testListerTousReclamation()
	{
	List<Reclamation> rec = reclamationRepository.findAll();
	for (Reclamation r : rec)
	{
	System.out.println(r);
	}
	}
}