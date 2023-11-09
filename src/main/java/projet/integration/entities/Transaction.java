package projet.integration.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity

public class Transaction implements Serializable {
	

@Id
@GeneratedValue (strategy = GenerationType.AUTO)
		private int id;
		private static final long serialVersionUID = 1L;
		private String type ;
		private Double montant;
		@Temporal(TemporalType.DATE)
		
		private LocalDate date;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public Double getMontant() {
		return montant;
	}
	
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	



	public Transaction(int id, String type, Double montant, LocalDate date) {
		super();
		this.id = id;
		this.type = type;
		this.montant = montant;
		this.date = date;
	}

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User  user;

	
	
	@ManyToOne
	@JoinColumn(name = "categorie_id")
	private Categorie categorie;
}
