package tn.esprit.service;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.entities.Account;
import tn.esprit.entities.Friends;
import tn.esprit.entities.Photos;
import tn.esprit.entities.Posts;
import tn.esprit.entities.Shares;
import tn.esprit.entities.User;
import tn.esprit.entities.Videos;



public interface Social_network_Interface {
	
	public User addUser(User user);
	public void deleteUserById(int id);
	public User consultUser(int id);
	public List<User> consultAllUsers();
	public void updateUserName(int id, String nom);
	
	
	public Account addAccount(Account account);
	public void deleteAccountById(int id);
	public List <Account> consultAllAccounts();
	public Account consultAccount(int id);
	
	public Friends addFriend(Friends friend);
	public void deleteFriendById(int id);
	public Friends searchFriend(int id);
	public List <Friends> searchAllFriends(int id);
	
	public Photos addPhoto(Photos photo);
	public void deletePhotoById(int id);
	public Photos searchPhoto(int id);
	public List<Photos> searchAllPhotos(int id);
	
	
	public Videos addVideo(Videos video);
	public void deleteVideoById(int id);
	public Videos searchVideo(int id);
	public List<Videos> searchAllVideos(int id);
	
	public Posts addPost(Posts post);
	public void deletePostById(int id);
	public Posts searchPost(int id);
	public List<Posts> searchAllPosts(int id);
	
	public Shares addShare(Shares share);
	public Shares searchShare(int id);
	public List<Shares> searchAllShares(int id);
	public void updateUserEmail(int id, String email);
	public void updateUserBirthDay(int id, String dateNaissance);
	public void updatePostTitle(int id, String title);
	public void updatePostDescription(int id, String description);
	public void updateVideoName(int id, String name);
	public void updatePhotoName(int id, String name);
	public void updateShareName(int id, String name);
	public void updateShareDescription(int id, String name);
	public void deleteShareById(int id);
	
	
	
	

}
