package tn.esprit.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin  implements Serializable {
	
	
	@Id @GeneratedValue
	private int idAdmin;
	private String name;
	private String email;
	@OneToMany(mappedBy = "admin")
	private Collection<User>users;
	public Admin() {
		super();
	}
	public Admin(int idAdmin, String name, String email) {
		super();
		this.idAdmin = idAdmin;
		this.name = name;
		this.email = email;
	}
	public int getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Collection<User> getUsers() {
		return users;
	}
	public void setUsers(Collection<User> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Admin [idAdmin=" + idAdmin + ", name=" + name + ", email=" + email + ", users=" + users + "]";
	}
	
	

}
