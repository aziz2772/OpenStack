package tn.esprit.spring.service;

import java.util.List;
import java.util.Map;



import tn.esprit.spring.entity.Enfant;


public interface EnfantService {
	List<Enfant> retrieveAllEnfant();
	Enfant addEnfant(Enfant e);
	void deleteEnfant(String id);
	Enfant updateEnfant(Enfant e );
	Enfant retrieveEnfant(String id);
	public List<Enfant> Search(String word);
	public int getnbEnfant();
	public int getnbG();
	public int getnbF();
	//public List<Enfant>pdf();
	/*void affecterEnfantAparent(int EnfantId, int parentId) ;*/

}
