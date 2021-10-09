package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Shares implements Serializable {
	
	
	@Id @GeneratedValue
	private int shareId;
	private String share_name;
	private String share_description;
	private Share_type share_type ;
	@ManyToOne
	private Account account;
	public Shares() {
		super();
	}
	public Shares(int share_id, String share_name, String share_description) {
		super();
		this.shareId = share_id;
		this.share_name = share_name;
		this.share_description = share_description;
	}
	public int getShare_id() {
		return shareId;
	}
	public void setShare_id(int share_id) {
		this.shareId = share_id;
	}
	public String getShare_name() {
		return share_name;
	}
	public void setShare_name(String share_name) {
		this.share_name = share_name;
	}
	public String getShare_description() {
		return share_description;
	}
	public void setShare_description(String share_description) {
		this.share_description = share_description;
	}
	public Share_type getShare_type() {
		return share_type;
	}
	public void setShare_type(Share_type share_type) {
		this.share_type = share_type;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Shares [share_id=" + shareId + ", share_name=" + share_name + ", share_description="
				+ share_description + ", share_type=" + share_type + ", account=" + account + "]";
	}
	
	
	

}
