package projet.integration.entities;

import java.io.Serializable;
import java.time.LocalDate;

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
@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		private String type ;
		private String montant;
		@Temporal(TemporalType.DATE)
		
		private LocalDate date;
	    private transient String categorieName;

		private String t_nom;

		
			@ManyToOne
	@JoinColumn(name = "user_id")
	private User  user;

	
	
	@ManyToOne
	@JoinColumn(name = "categorie_id")
	private Categorie categorie;
    public String getT_nom() {
        return t_nom;
    }

    public void setT_nom(String t_nom) {
        this.t_nom = t_nom;
    }

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
	
	public String getMontant() {
		return montant;
	}
	
	public void setMontant(String montant) {
		this.montant = montant;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	

 public Categorie getCategorie() {
        return categorie;
    }

	public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
        if (categorie != null) {
            this.categorieName = categorie.getNom();
        }
    }

    public String getCategorieName() {
        return categorieName;
    }

    public void setCategorieName(String categorieName) {
        this.categorieName = categorieName;
    }



	public Transaction(int id, String type, String montant, LocalDate date,Categorie categorie,String t_nom) {
		super();
		this.id = id;
		this.type = type;
		this.montant = montant;
		this.date = date;
		this.categorie = categorie;
		this.t_nom = t_nom;
	}
   	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
