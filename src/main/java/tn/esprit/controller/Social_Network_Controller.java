package tn.esprit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.entities.Account;
import tn.esprit.entities.Friends;
import tn.esprit.entities.Photos;
import tn.esprit.entities.Posts;
import tn.esprit.entities.Shares;
import tn.esprit.entities.User;
import tn.esprit.entities.Videos;
import tn.esprit.service.Social_network_Interface;



@RestController
public class Social_Network_Controller {
	
	@Autowired
	private Social_network_Interface social_network_metier;
	
	/////////////////////////////////  Adding ////////////////////////////////////////////////////
	
	//Add a new user
	//URL : http://localhost:8180/SpringMVC/servlet/addUser
	@PostMapping("/addUser")
	public void addNewUser(@RequestBody User user){
		social_network_metier.addUser(user);
	}
	
	//Add a new Account
	//URL : http://localhost:8180/SpringMVC/servlet/addAccount
	@PostMapping("/addAccount")
	public void addNewAccount(@RequestBody Account account){
		social_network_metier.addAccount(account);
	}
	
	//Add a new friend
	//URL : http://localhost:8180/SpringMVC/servlet/addFriend
	@PostMapping("/addFriend")
	public void addNewFriend(@RequestBody Friends friend){
		social_network_metier.addFriend(friend);
	}
	
	//Add a new photo
	//URL : http://localhost:8180/SpringMVC/servlet/addPhoto
	@PostMapping("/addPhoto")
	public void addNewPhoto(@RequestBody Photos photo){
		social_network_metier.addPhoto(photo);
	}
	
	//add a new video
	//URL : http://localhost:8180/SpringMVC/servlet/addVideo
	@PostMapping("/addVideo")
	public void addNewVideo(@RequestBody Videos video){
		social_network_metier.addVideo(video);
	}
	
	//add a new post
	//URL : http://localhost:8180/SpringMVC/servlet/addPost
	@PostMapping("/addPost")
	public void addNewPost(@RequestBody Posts post){
		social_network_metier.addPost(post);
	}
	
	// add a new share 
	//URL : http://localhost:8180/SpringMVC/servlet/addShare
	@PostMapping("/addShare")
	public void addNewShare(@RequestBody Shares share){
		social_network_metier.addShare(share);
	}
	
    /////////////////////////////////  Consulting/Searching "one" ////////////////////////////////////////////////////
	
	
	//searching for a User
	//URL : http://localhost:8180/SpringMVC/servlet/searchUser/{id}
	@GetMapping("/searchUser/{id}")
	public User searchUser(@PathVariable("id") int id){
		return social_network_metier.consultUser(id);
	}
			
			
	//searching for an account 
	//URL : http://localhost:8180/SpringMVC/servlet/searchAccount/{id}
	@GetMapping("/searchAccount/{id}")
	public Account searchAccount(@PathVariable("id") int id){
		return social_network_metier.consultAccount(id);
	}
			
	//searching for a friend
	//URL : http://localhost:8180/SpringMVC/servlet/searchFriend/{id}
	@GetMapping("/searchFriend/{id}")
	public Friends searchAFriend(@PathVariable("id") int id){
		return social_network_metier.searchFriend(id);
	}
	
	//searching a photo
	//URL : http://localhost:8180/SpringMVC/servlet/searchPhoto/{id}
	@GetMapping("/searchPhoto/{id}")
	public Photos searchAPhoto(@PathVariable("id") int id){
		return social_network_metier.searchPhoto(id);
	}
	
	//searching for a video
	//URL : http://localhost:8180/SpringMVC/servlet/searchVideo/{id}
	@GetMapping("/searchVideo/{id}")
	public Videos searchAVideo(@PathVariable("id") int id){
		return social_network_metier.searchVideo(id);
	}
	
	//searching for a post
	//URL : http://localhost:8180/SpringMVC/servlet/searchPost/{id}
	@GetMapping("/searchPost/{id}")
	public Posts searchAPost(@PathVariable("id") int id){
		return social_network_metier.searchPost(id);
	}
	
	//searching for a share
	//URL : http://localhost:8180/SpringMVC/servlet/searchShare/{id}
	@GetMapping("/searchShare/{id}")
	public Shares searchAShare(@PathVariable("id") int id){
		return social_network_metier.searchShare(id);
	}
	
	////////////////////////////////Deleting///////////////////////////////////////////////
	
	//deleting a user
	//URL : http://localhost:8180/SpringMVC/servlet/deleteUser/{id}
	@PutMapping("/deleteUser/{id}")
	public void deleteAUser(@PathVariable("id") int id){
		social_network_metier.deleteUserById(id);
	}
	
	//delete an account
	//URL : http://localhost:8180/SpringMVC/servlet/deleteAccount/{id}
	@PutMapping("/deleteAccount/{id}")
	public void deleteAnAccount(@PathVariable("id") int id){
		social_network_metier.deleteAccountById(id);
	}
	
	//delete an friend
	//URL : http://localhost:8180/SpringMVC/servlet/deleteFriend/{id}
	@PutMapping("/deleteFriend/{id}")
	public void deleteAFriend(@PathVariable("id") int id){
		social_network_metier.deleteFriendById(id);
	}
	
	//delete a photo
	//URL : http://localhost:8180/SpringMVC/servlet/deletePhoto/{id}
	@PutMapping("/deletePhoto/{id}")
	public void deleteAPhoto(@PathVariable("id") int id){
		social_network_metier.deletePhotoById(id);
	}
	
	//delete a video//URL : http://localhost:8180/SpringMVC/servlet/deleteVideo/{id}
	@PutMapping("/deleteVideo/{id}")
	public void deleteAVideo(@PathVariable("id") int id){
		social_network_metier.deleteVideoById(id);
	}
	
	//delete a post 
	//URL : http://localhost:8180/SpringMVC/servlet/deletePost/{id}
	@PutMapping("/deletePost/{id}")
	public void deleteAPost(@PathVariable("id") int id){
		social_network_metier.deletePostById(id);
	}
	
	//delete a share 
	//URL : http://localhost:8180/SpringMVC/servlet/deleteShare/{id}
	@PutMapping("/deleteShare/{id}")
	public void deleteAShare(@PathVariable("id") int id){
		social_network_metier.deleteShareById(id);
	}
	
	///////////////////////////////// Search all /////////////////////////////////////
	
	//search all users
	//URL : http://localhost:8180/SpringMVC/servlet/searchUsers
	@GetMapping("/searchUsers")
	public List<User> searchUsers(){
		return social_network_metier.consultAllUsers();
	}
	
	
	//search all accounts 
	//URL : http://localhost:8180/SpringMVC/servlet/searchAccounts
	@GetMapping("/searchAccounts")
	public List<Account> searchAccounts(){
		
		return social_network_metier.consultAllAccounts();
	}
	
	//search all friends in one account 
	//URL : http://localhost:8180/SpringMVC/servlet/searchFriends/{id}
	@GetMapping("/searchFriends/{id}")
	public List<Friends> searchFriends(@PathVariable("id") int id){
		return social_network_metier.searchAllFriends(id);
	}
	
	//search all photos in one account
	//URL : http://localhost:8180/SpringMVC/servlet/searchPhotos/{id}
	@GetMapping("/searchPhotos/{id}")
	public List<Photos> searchPhotos(@PathVariable("id") int id){
		return social_network_metier.searchAllPhotos(id);
	}
	
	//search all posts in one account
	//URL : http://localhost:8180/SpringMVC/servlet/searchPosts/{id}
	@GetMapping("/searchPosts/{id}")
	public List<Posts> searchPosts(@PathVariable("id") int id){
		return social_network_metier.searchAllPosts(id);
	}
	
	//search all videos in one account
	//URL : http://localhost:8180/SpringMVC/servlet/searchVideos/{id}
	@GetMapping("/searchVideos/{id}")
	public List<Videos> searchVideos(@PathVariable("id") int id){
		return social_network_metier.searchAllVideos(id);
	}
	
	//search all shares in one account 
	//URL : http://localhost:8180/SpringMVC/servlet/searchShares/{id}
	@GetMapping("/searchShares/{id}")
	public List<Shares> searchShares(@PathVariable("id") int id){
		return social_network_metier.searchAllShares(id);
	}
	
	////////////////////////////////Editing////////////////////////////////////////////////////
	
	//Editing the user 
	//URL : http://localhost:8180/SpringMVC/servlet/updateUserName/{id}/{nom}
	@PutMapping("/updateUserName/{id}/{nom}")
	public void updateUserName(@PathVariable("id") int id,@PathVariable("nom") String nom){
	    social_network_metier.updateUserName(id , nom);
	}
	
	//URL : http://localhost:8180/SpringMVC/servlet/updateUserEmail/{id}/{email}
	@PutMapping("/updateUserEmail/{id}/{email}")
	public void updateUserEmail(@PathVariable("id") int id,@PathVariable("email") String email){
	    social_network_metier.updateUserEmail(id , email);
	}
	
	//URL : http://localhost:8180/SpringMVC/servlet/updateUserBirthDay/{id}/{dateNaissance}
	@PutMapping("/updateUserBirthDay/{id}/{dateNaissance}")
	public void updateUserBirthDate(@PathVariable("id") int id,@PathVariable("dateNaissance")  String dateNaissance){
	    social_network_metier.updateUserBirthDay(id , dateNaissance);
	}
	
	//Editing posts
	//URL : http://localhost:8180/SpringMVC/servlet/updatePostTitle/{id}/{title}
	@PutMapping("/updatePostTitle/{id}/{title}")
	public void updatePostTitle(@PathVariable("id") int id,@PathVariable("title") String title){
	    social_network_metier.updatePostTitle(id , title);
	}
	
	//URL : http://localhost:8180/SpringMVC/servlet/updatePostDescription/{id}/{description}
	@PutMapping("/updatePostDescription/{id}/{description}")
	public void updatePostDescription(@PathVariable("id") int id,@PathVariable("description") String description){
	    social_network_metier.updatePostDescription(id , description);
	}
	
	//Editing videos
	//URL : http://localhost:8180/SpringMVC/servlet/updateVideoName/{id}/{name}
	@PutMapping("/updateVideoName/{id}/{name}")
	public void updateVideoName(@PathVariable("id") int id,@PathVariable("name")  String name){
	    social_network_metier.updateVideoName(id , name);
	}
	
	//Editing Photos
	//URL : http://localhost:8180/SpringMVC/servlet/updatePhotoName/{id}/{name}
	@PutMapping("/updatePhotoName/{id}/{name}")
	public void updatePhotoName(@PathVariable("id") int id,@PathVariable("name") String name){
	    social_network_metier.updatePhotoName(id , name);
	}
	
	//Editing sharing 
	//URL : http://localhost:8180/SpringMVC/servlet/updateShareName/{id}/{name}
	@PutMapping("/updateShareName/{id}/{name}")
	public void updateShareName(@PathVariable("id") int id,@PathVariable("name") String name){
	    social_network_metier.updateShareName(id , name);
	}
	
	//URL : http://localhost:8180/SpringMVC/servlet/updateShareDescription/{id}/{description}
	@PutMapping("/updateShareDescription/{id}/{description}")
	public void updateShareDescription(@PathVariable("id")int id,@PathVariable("description") String description){
	    social_network_metier.updateShareDescription( id ,  description);
	}

}
