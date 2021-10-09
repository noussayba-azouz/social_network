package tn.esprit.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.dao.AccountRepository;
import tn.esprit.dao.FriendsRepository;
import tn.esprit.dao.PhotosRepository;
import tn.esprit.dao.PostsRepository;
import tn.esprit.dao.SharesRepository;
import tn.esprit.dao.UserRepository;
import tn.esprit.dao.VideosRepository;
import tn.esprit.entities.Account;
import tn.esprit.entities.Friends;
import tn.esprit.entities.Photos;
import tn.esprit.entities.Posts;
import tn.esprit.entities.Shares;
import tn.esprit.entities.User;
import tn.esprit.entities.Videos;


@Service
public class Social_network_Implement implements Social_network_Interface{
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private FriendsRepository friendRepository;
	@Autowired
	private PhotosRepository photoRepository;
	@Autowired
	private PostsRepository postRepository;
	@Autowired
	private VideosRepository videoRepository;
	@Autowired
	private SharesRepository shareRepository;
	

	@Override
	public User addUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public void deleteUserById(int id) {
		userRepository.deleteByUserId(id);
	}

	@Override
	public User consultUser(int id) {
		User user = userRepository.findByUserId(id);
		return user;
	}
	
	@Override
	public Account addAccount(Account account){
		return accountRepository.save(account);
	}

	@Override
	public List <Account> consultAllAccounts() {
		return (List<Account>) accountRepository.findAll();
	}

	@Override
	public Account consultAccount(int id) {
		Account account = accountRepository.findByIdAccount(id);
		return account;
	}

	@Override
	public Friends addFriend(Friends friend) {
		//Account account = consultAccount(id);
		return friendRepository.save(friend);
	}

	@Override
	public void deleteFriendById(int id) {
		friendRepository.deleteByFriendId(id);
		
	}

	@Override
	public Friends searchFriend(int id) {
		Friends friend = friendRepository.findByFriendId(id);
		return friend;
	}

	@Override
	public Photos addPhoto(Photos photo) {
		
		return photoRepository.save(photo);
	}

	@Override
	public void deletePhotoById(int id) {
		photoRepository.deleteByIdPhotos(id);
		
	}

	@Override
	public Photos searchPhoto(int id) {
		Photos photo = photoRepository.findByIdPhotos(id);
		return photo;
	}

	@Override
	public List<Photos> searchAllPhotos(int id) {
		Account account = consultAccount(id);
		return (List<Photos>) photoRepository.findByAccount(account);
	}

	@Override
	public Videos addVideo(Videos video) {
		
		return videoRepository.save(video);
	}

	@Override
	public void deleteVideoById(int id) {
		videoRepository.deleteByVideoId(id);	
	}

	@Override
	public Videos searchVideo(int id) {
		Videos video = videoRepository.findByVideoId(id);
		return video;
	}

	@Override
	public List<Videos> searchAllVideos(int id) {
		Account account = consultAccount(id);
		return (List<Videos>) videoRepository.findByAccount(account);
	}

	@Override
	public Posts addPost(Posts post) {
		return postRepository.save(post);
	}

	@Override
	public void deletePostById(int id) {
		postRepository.deleteByPostId(id);
		
	}

	@Override
	public Posts searchPost(int id) {
		Posts post = postRepository.findByPostId(id);
		return post;
	}

	@Override
	public List<Posts> searchAllPosts(int id) {
		Account account = consultAccount(id);
		return (List<Posts>) postRepository.findByAccount(account);
	}

	@Override
	public Shares addShare(Shares share) {
		return shareRepository.save(share);
	}

	@Override
	public void deleteShareById(int id) {
		shareRepository.deleteByShareId(id);
		
	}

	@Override
	public Shares searchShare(int id) {
		Shares share = shareRepository.findByShareId(id);
		return share;
	}

	@Override
	public List<Shares> searchAllShares(int id) {
		Account account = consultAccount(id);
		return (List<Shares>) shareRepository.findByAccount(account);
	}

	@Override
	public void deleteAccountById(int id) {
		accountRepository.deleteByIdAccount(id);
		
	}

	@Override
	public List<User> consultAllUsers() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public List<Friends> searchAllFriends(int id) {
		Account account = consultAccount(id);
		return (List<Friends>) friendRepository.findByAccount(account);
	}

	@Override
	public void updateUserName(int id, String nom) {
		 userRepository.updateJustNameById(id, nom);
	}

	@Override
	public void updateUserEmail(int id, String email) {
		userRepository.updateJustEmailById(id, email);
		
	}

	@Override
	public void updateUserBirthDay(int id, String dateNaissance) {
		userRepository.updateJustBirthDateById(id, dateNaissance);
		
	}

	@Override
	public void updatePostTitle(int id, String title) {
		postRepository.updateJustTitleById(id, title);
		
	}

	@Override
	public void updatePostDescription(int id, String description) {
		postRepository.updateJustDescriptionById(id, description);
		
	}

	@Override
	public void updateVideoName(int id, String name) {
		videoRepository.updateJustNameById(id, name);
		
	}

	@Override
	public void updatePhotoName(int id, String name) {
		photoRepository.updateJustNameById(id, name);
		
	}

	@Override
	public void updateShareName(int id, String name) {
		shareRepository.updateJustNameById(id, name);
		
	}

	@Override
	public void updateShareDescription(int id, String description) {
		shareRepository.updateJustDescriptionById(id, description);
		
	}


}
