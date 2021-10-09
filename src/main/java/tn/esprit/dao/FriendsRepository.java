package tn.esprit.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Account;
import tn.esprit.entities.Friends;


@Repository
public interface FriendsRepository extends CrudRepository<Friends, Integer>{
	
	public Friends findByFriendId(int id); 
	public List<Friends> findByAccount(Account account);
	public void deleteByFriendId(int id);

}
