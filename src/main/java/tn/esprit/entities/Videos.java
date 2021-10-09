package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Videos implements Serializable {
	
	@Id @GeneratedValue
	private int videoId;
	private String video_name;
	@ManyToOne
	private Account account;
	
	//constructors
	
	public Videos() {
		super();
	}

	public Videos(int video_id, String video_name) {
		super();
		this.videoId = video_id;
		this.video_name = video_name;
	}
	//getters and setters

	public int getVideo_id() {
		return videoId;
	}

	public void setVideo_id(int video_id) {
		this.videoId = video_id;
	}

	public String getVideo_name() {
		return video_name;
	}

	public void setVideo_name(String video_name) {
		this.video_name = video_name;
	}
	
	
	//toString

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Videos [video_id=" + videoId + ", video_name=" + video_name + ", account=" + account + "]";
	}

	
	
	
	
	

}
