package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import ma.glasnost.orika.MapperFacade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PostDao;
import com.dto.PostDto;
import com.model.Post;
import com.service.PostSvc;
import com.util.CommonConstants;

@Service
@Transactional
public class PostSvcImpl implements PostSvc {

	@Autowired
	private PostDao postDao;
	
	@Autowired
	private MapperFacade mapperFacade;
	
	
	@Override
	public List<PostDto> getAll() {
		List<PostDto> listPostDtos = new ArrayList<>();
		List<Object[]> obj=new ArrayList<>();
		obj=postDao.getAll();
		listPostDtos = mapperFacade.mapAsList(obj, PostDto.class);
		return listPostDtos;
	}


	
	

	@Override
	public PostDto getOne(String id) {
		PostDto postDto=mapperFacade.map(postDao.getOne(id), PostDto.class);
		return postDto;
	}


	@Override
	public int save(PostDto post) {
		Post obj = postDao.getOne(post.getId());
		if (!(obj==null)){
			return 2;
		}
		try{
			Post val = mapperFacade.map(post, Post.class);
			postDao.save(val);
			return CommonConstants.OK_REST_STATUS;
		}catch (Exception e){
			return CommonConstants.ERROR_REST_STATUS;
		}
	}


	@Override
	public int update(PostDto post) {
		Post obj = postDao.getOne(post.getId());
		if (obj==null){
			return 2;
		}
		try{
			Post val = mapperFacade.map(post, Post.class);
			postDao.save(val);
			return CommonConstants.OK_REST_STATUS;
		}catch (Exception e){
			return CommonConstants.ERROR_REST_STATUS;
		}
		
	}


	@Override
	public int delete(String post) {
		try{
			postDao.delete(post);
			return CommonConstants.OK_REST_STATUS;
		}catch(Exception e){
			return CommonConstants.ERROR_REST_STATUS;
		}	
	}


}
