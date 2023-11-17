package projet.integration.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import projet.integration.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Integer>{
	Categorie findByMois(String mois);


	
}

