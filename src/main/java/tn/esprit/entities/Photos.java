package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Photos  implements Serializable{
	@Id @GeneratedValue
	private int idPhotos;
	private String name_photo;
	private Date date_photo;																																																																																																																																								
	private String size_photo;
	@ManyToOne
	private Account account;
	public Photos() {
		super();
	}
	public Photos(int idPhotos, String name_photo, Date date_photo, String size_photo, Account account) {
		super();
		this.idPhotos = idPhotos;
		this.name_photo = name_photo;
		this.date_photo = date_photo;
		this.size_photo = size_photo;
		this.account = account;
	}
	public int getIdPhotos() {
		return idPhotos;
	}
	public void setIdPhotos(int idPhotos) {
		this.idPhotos = idPhotos;
	}
	public String getName_photo() {
		return name_photo;
	}
	public void setName_photo(String name_photo) {
		this.name_photo = name_photo;
	}
	public Date getDate_photo() {
		return date_photo;
	}
	public void setDate_photo(Date date_photo) {
		this.date_photo = date_photo;
	}
	public String getSize_photo() {
		return size_photo;
	}
	public void setSize_photo(String size_photo) {
		this.size_photo = size_photo;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Photos [idPhotos=" + idPhotos + ", name_photo=" + name_photo + ", date_photo=" + date_photo
				+ ", size_photo=" + size_photo + ", account=" + account + "]";
	}
	
	

}
