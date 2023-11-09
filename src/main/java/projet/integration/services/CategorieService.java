package projet.integration.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projet.integration.entities.Categorie;

import projet.integration.repositories.CategorieRepository;

@Service 
public class CategorieService {
	
	@Autowired
	CategorieRepository cat;
	
	public Categorie addCategorie(Categorie t) {
		return cat.save(t);
	}
	
	public List<Categorie> findCategorie(){
		return cat.findAll();
	}
	
	public Categorie updateCategorie(Categorie u) {
		return cat.save(u);
	}
	
	public void deleteCategorie(int id) {
		cat.deleteById(id);
	}
	
	//*********
	   public Categorie getBudgetByMois(Date mois) {
	        return cat.findByMois(mois);
	    }

}
