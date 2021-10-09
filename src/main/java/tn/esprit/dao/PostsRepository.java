package tn.esprit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Account;
import tn.esprit.entities.Posts;

@Repository
public interface PostsRepository extends CrudRepository<Posts, Integer>{
	
	public Posts findByPostId(int post_id);

	public List<Posts> findByAccount(Account account);
	@Modifying
	@Transactional
	@Query("update Posts post set post.post_title=:title where post.postId=:id")
	public void updateJustTitleById(@Param("id")int postId,@Param("title") String post_title);
	@Modifying
	@Transactional
	@Query("update Posts post set post.post_description=:description where post.postId=:id")
	public void updateJustDescriptionById(@Param("id")int postId,@Param("description") String post_description);

	public void deleteByPostId(int id);

}
