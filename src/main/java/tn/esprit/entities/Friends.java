package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Friends implements Serializable{
	
	
	@Id @GeneratedValue
	private int friendId;
	private String friend_name;
	@ManyToOne
	private Account account;
	public Friends() {
		super();
	}
	public Friends(int friendId, String friend_name, Account account) {
		super();
		this.friendId = friendId;
		this.friend_name = friend_name;
		this.account = account;
	}
	public Friends(String friend_name, Account account) {
		
		
		this.friend_name = friend_name;
		this.account = account;
	}
	
	public int getFriendId() {
		return friendId;
	}
	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}
	public String getFriend_name() {
		return friend_name;
	}
	public void setFriend_name(String friend_name) {
		this.friend_name = friend_name;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Friends [friendId=" + friendId + ", friend_name=" + friend_name + ", account=" + account + "]";
	}
	
	

}
