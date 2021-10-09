package tn.esprit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Account;
import tn.esprit.entities.Videos;


@Repository
public interface VideosRepository extends CrudRepository<Videos, Integer>{
	public Videos findByVideoId(int video_id);

	public List<Videos> findByAccount(Account account);
    
	@Modifying
	@Transactional
	@Query("update Videos video set video.video_name=:name where video.videoId=:id")
	public void updateJustNameById(@Param("id")int videoId,@Param("name") String video_name);

	public void deleteByVideoId(int id);



}
