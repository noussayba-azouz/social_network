package tn.esprit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Account;
import tn.esprit.entities.Shares;

@Repository
public interface SharesRepository extends CrudRepository<Shares, Integer>{
	
	public Shares findByShareId(int share_id);

	public List<Shares> findByAccount(Account account);
    
	@Modifying
	@Transactional
	@Query("update Shares share set share.share_name=:name where share.shareId=:id")
	public void updateJustNameById(@Param("id")int shareId,@Param("name") String share_name);
    
	@Modifying
	@Transactional
	@Query("update Shares share set share.share_description=:description where share.shareId=:id")
	public void updateJustDescriptionById(@Param("id")int shareId,@Param("description") String share_description);

	public void deleteByShareId(int id);
	
	

}
