package tn.esprit.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Account;


@Repository
public interface AccountRepository extends CrudRepository<Account, Integer>{
	
	public Account findByIdAccount(int id);

	public void deleteByIdAccount(int id); 

}
