package projet.integration.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import projet.integration.entities.Categorie;
import projet.integration.services.CategorieService;


@RestController
@CrossOrigin(origins=("*"))
@RequestMapping("categorie")

public class CategorieController {
	@Autowired
	CategorieService CatService;
	
	@GetMapping
	List<Categorie> all(){
		return CatService.findCategorie();
	}
	
	@PostMapping
	Categorie newCategorie(@RequestBody Categorie c) {
		return CatService.addCategorie(c);
	}

	@PutMapping("/{id}")
	Categorie updateCategorie(@RequestBody Categorie etudiant, @PathVariable int id) {
		return  CatService.updateCategorie(etudiant);
	}
	
	@DeleteMapping("/{id}")
	void deleteCategorie(@PathVariable int id) {
		CatService.deleteCategorie(id);
	}

	
	//***************
    @GetMapping("/budget")
    public Categorie getBudgetByMois(@RequestParam("mois") @DateTimeFormat(pattern = "yyyy-MM-dd") Date mois) {
        return CatService.getBudgetByMois(mois);
    }

}