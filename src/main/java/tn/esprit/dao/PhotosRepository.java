package tn.esprit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Account;
import tn.esprit.entities.Photos;

@Repository
public interface PhotosRepository extends CrudRepository<Photos, Integer>{
	
	public Photos findByIdPhotos(int id_photos);
	public List<Photos> findByAccount(Account account);
	
	@Modifying
	@Transactional
	@Query("update Photos photo set photo.name_photo=:name where photo.idPhotos=:id")
	public void updateJustNameById(@Param("id")int idPhotos,@Param("name") String name_photo);
	public void deleteByIdPhotos(int id);

}
