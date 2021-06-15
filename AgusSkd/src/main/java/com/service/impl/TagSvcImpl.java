package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import ma.glasnost.orika.MapperFacade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Tag;
import com.dao.TagDao;
import com.dto.TagDto;
import com.service.TagSvc;
import com.util.CommonConstants;

@Service
@Transactional
public class TagSvcImpl implements TagSvc {

	@Autowired
	private TagDao tagDao;
	
	@Autowired
	private MapperFacade mapperFacade;
	
	
	@Override
	public List<TagDto> getAll() {
		List<TagDto> listTagDtos = new ArrayList<>();
		List<Object[]> obj=new ArrayList<>();
		obj=tagDao.getAll();
		listTagDtos = mapperFacade.mapAsList(obj, TagDto.class);
		return listTagDtos;
	}


	@Override
	public TagDto getOne(String id) {
		TagDto tagDto=mapperFacade.map(tagDao.getOne(id), TagDto.class);
		return tagDto;
	}


	@Override
	public int save(TagDto tag) {
		Tag obj = tagDao.getOne(tag.getId());
		if (!(obj==null)){
			return 2;
		}
		try{
			Tag val = mapperFacade.map(tag, Tag.class);
			tagDao.save(val);
			return CommonConstants.OK_REST_STATUS;
		}catch (Exception e){
			return CommonConstants.ERROR_REST_STATUS;
		}
	}


	@Override
	public int update(TagDto tag) {
		Tag obj = tagDao.getOne(tag.getId());
		if (obj==null){
			return 2;
		}
		try{
			Tag val = mapperFacade.map(tag, Tag.class);
			tagDao.save(val);
			return CommonConstants.OK_REST_STATUS;
		}catch (Exception e){
			return CommonConstants.ERROR_REST_STATUS;
		}
		
	}


	@Override
	public int delete(String tag) {
		try{
			tagDao.delete(tag);
			return CommonConstants.OK_REST_STATUS;
		}catch(Exception e){
			return CommonConstants.ERROR_REST_STATUS;
		}	
	}


}
