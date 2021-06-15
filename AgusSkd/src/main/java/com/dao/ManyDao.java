package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.dto.ManyDto;
import com.model.Post;

public interface ManyDao extends JpaRepository<Post, String> {

	@Query("select new com.dto.ManyDto( " + 
			" ps.id, ps.title, ps.content, ps.tags, tg.label, tg.posts) " +
			" from com.model.Post ps , com.model.Tag tg"
			+ " where ps.id = tg.id ")
			public List<ManyDto>getAllMultiple();
		
			
			
}
