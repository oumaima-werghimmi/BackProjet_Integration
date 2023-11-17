package projet.integration.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import projet.integration.entities.Categorie;
import jakarta.persistence.EntityManager;

import projet.integration.repositories.CategorieRepository;

@Service 
public class CategorieService {
	 
  @PersistenceContext
    private EntityManager entityManager;

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
	
	@Transactional
    public Categorie findCategorieByName(String categorieName) {
        try {
            return entityManager.createQuery("SELECT c FROM Categorie c WHERE c.nom = :nom", Categorie.class)
                .setParameter("nom", categorieName)
                .getSingleResult();
        } catch (NoResultException e) {
            return null; 
        }
    }
	//*********
	   public Categorie getBudgetByMois(String mois) {
	        return cat.findByMois(mois);
	    }

}
