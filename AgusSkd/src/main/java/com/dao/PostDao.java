package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.model.Post;


public interface PostDao extends JpaRepository<Post, String> {

	@Query("select a from Post a")
	public List<Object[]> getAll();
	
	
	@Query("select a from Post a where a.id = :id")
	public Post getOne(@Param("id") String id);	
	

	
	
}
