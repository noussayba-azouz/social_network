package tn.esprit.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	
	public User findByUserId(int user_id);
	@Modifying
	@Transactional
	@Query("update User user set user.nom=:nom where user.userId=:id")
	public void updateJustNameById(@Param("id")int userId, @Param("nom")String nom);
	
	@Modifying
	@Transactional
	@Query("update User user set user.email=:email where user.userId=:id")
	public void updateJustEmailById(@Param("id")int userId,@Param("email") String email);
	
	@Modifying
	@Transactional
	@Query("update User user set user.dateNaissance=:dateNaissance where user.userId=:id")
	public void updateJustBirthDateById(@Param("id")int userId,@Param("dateNaissance") String dateNaissance);
	
	public void deleteByUserId(int id);
	
}
