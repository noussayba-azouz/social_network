package tn.esprit.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class User implements Serializable {
	
	
	
	@Id @GeneratedValue
	private int userId;
	private String nom;
	private String email;
	private Date dateNaissance;
	@OneToMany(mappedBy = "user")
	private Collection<Account>accounts;
	@ManyToOne
	private Admin admin;
	public User() {
	
	}
	
	
	
	public User(int user_id, String nom, String email, Date dateNaissance) {
		
		this.userId = user_id;
		this.nom = nom;
		this.email = email;
		this.dateNaissance = dateNaissance;
	}
	public int getUser_id() {
		return userId;
	}
	public void setUser_id(int user_id) {
		this.userId = user_id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Collection<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(Collection<Account> accounts) {
		this.accounts = accounts;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	@Override
	public String toString() {
		return "User [user_id=" + userId + ", nom=" + nom + ", email=" + email + ", dateNaissance=" + dateNaissance
				+ ", accounts=" + accounts + ", admin=" + admin + "]";
	}
	
	
	

}
