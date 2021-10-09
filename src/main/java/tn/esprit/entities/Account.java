package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account implements Serializable {
	
	
	@Id @GeneratedValue
	private int idAccount;
	private String email;
	@ManyToOne
	private User user;
	public Account() {
		super();
	}
	public Account(int idAccount, String email, User user) {
		super();
		this.idAccount = idAccount;
		this.email = email;
		this.user = user;
	}
	public int getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Account [idAccount=" + idAccount + ", email=" + email + ", user=" + user + "]";
	}
	
	
	

}
