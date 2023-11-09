package projet.integration.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class User implements Serializable {
	

@Id
@GeneratedValue (strategy = GenerationType.AUTO)
		private int id;
		private static final long serialVersionUID = 1L;
		private String nom;
		private String prenom ;
		private String email;
		private String pwd;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
	
		public User(int id, String nom, String prenom, String email, String pwd) {
			super();
			this.id = id;
			this.nom = nom;
			this.prenom = prenom;
			this.email = email;
			this.pwd = pwd;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		@OneToMany(mappedBy = "user")
		private List<Transaction> transactions;
}
