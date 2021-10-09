
package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Posts implements Serializable {
	
	
	@Id @GeneratedValue
	private int postId;
	private String post_title;
	private String post_description;
	private int post_user_id;
	@ManyToOne
	private Account account;
	public Posts() {
		super();
	}
	public Posts(int post_id, String post_title, String post_description, int post_user_id) {
		super();
		this.postId = post_id;
		this.post_title = post_title;
		this.post_description = post_description;
		this.post_user_id = post_user_id;
	}
	public int getPost_id() {
		return postId;
	}
	public void setPost_id(int post_id) {
		this.postId = post_id;
	}
	public String getPost_title() {
		return post_title;
	}
	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}
	public String getPost_description() {
		return post_description;
	}
	public void setPost_description(String post_description) {
		this.post_description = post_description;
	}
	public int getPost_user_id() {
		return post_user_id;
	}
	public void setPost_user_id(int post_user_id) {
		this.post_user_id = post_user_id;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Posts [post_id=" + postId + ", post_title=" + post_title + ", post_description=" + post_description
				+ ", post_user_id=" + post_user_id + ", account=" + account + "]";
	}
	
	
	
	

}
