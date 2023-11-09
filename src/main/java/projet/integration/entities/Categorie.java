package projet.integration.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie implements Serializable {
	

@Id
@GeneratedValue (strategy = GenerationType.AUTO)
		private int id;
		private static final long serialVersionUID = 1L;
		private Double budget;
		private Date mois;
		private String nom ;
		
		
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getBudget() {
		return budget;
	}
	public void setBudget(Double budget) {
		this.budget = budget;
	}
	public Date getMois() {
		return mois;
	}
	public void setMois(Date mois) {
		this.mois = mois;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public Categorie(int id, Double budget, Date mois, String nom) {
		super();
		this.id = id;
		this.budget = budget;
		this.mois = mois;
		this.nom = nom;
	}
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@OneToMany(mappedBy = "categorie")
	private List<Transaction> transactions;
	
	
}
