package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.model.Tag;

public interface TagDao extends JpaRepository<Tag, String> {

	@Query("select a from Tag a")
	public List<Object[]> getAll();

	@Query("select a from Tag a where a.id = :id")
	public Tag getOne(@Param("id") String id);	
	

	
	
}
