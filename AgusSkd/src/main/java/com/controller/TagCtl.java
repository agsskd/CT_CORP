package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import response.RestResponse;

import com.dto.TagDto;
import com.service.TagSvc;
import com.util.CommonConstants;

@RestController
@RequestMapping("/tag")
public class TagCtl {
	
	@Autowired
	private TagSvc tagSvc;
	
	@RequestMapping(value="/all" , method = RequestMethod.GET)	
	public RestResponse getAll(){
		RestResponse restResponse=new RestResponse();
		restResponse.setCode(CommonConstants.OK_REST_STATUS);
		restResponse.setDesc(CommonConstants.OK_REST_DESC);
		restResponse.setModules(tagSvc.getAll());
		restResponse.setTotalRecords(tagSvc.getAll().size());
		return restResponse;
	}
	
	
	@RequestMapping(value="/one/{id}",method=RequestMethod.GET)
	public RestResponse getOneBarang(@PathVariable ("id") String id){
		TagDto tagDto=new TagDto();
		tagDto=tagSvc.getOne(id);
		RestResponse restResponse=new RestResponse();
		restResponse.setModules(tagDto);
		restResponse.setCode(CommonConstants.OK_REST_STATUS);
		restResponse.setDesc(CommonConstants.OK_REST_DESC);
		return restResponse;
	}
	
	@RequestMapping(value="/save" ,method = RequestMethod.POST)
	public RestResponse save(@RequestBody TagDto tagDto) {
		RestResponse restResponse = new RestResponse();
		int i = tagSvc.save(tagDto);
		restResponse.setCode(i);
		if (i== CommonConstants.OK_REST_STATUS){
			restResponse.setCode(CommonConstants.OK_REST_STATUS);
			restResponse.setDesc(CommonConstants.OK_REST_DESC);
		}else if (i== 2){
			restResponse.setCode(CommonConstants.OK_REST_STATUS);
			restResponse.setDesc(CommonConstants.OK_REST_DESC);
		}else {
			restResponse.setCode(CommonConstants.OK_REST_STATUS);
			restResponse.setDesc(CommonConstants.ERROR_REST_DESC.concat(" Updated"));
		}	
		return restResponse;
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public RestResponse update(@RequestBody TagDto tagDto){
		RestResponse restResponse=new RestResponse();
		int i= tagSvc.update(tagDto);
		if(i==CommonConstants.OK_REST_STATUS){
			restResponse.setCode(CommonConstants.OK_REST_STATUS);
			restResponse.setDesc(CommonConstants.OK_REST_DESC);
		}else if(i==2){
			
		}else{
			restResponse.setDesc(CommonConstants.ERROR_REST_DESC.concat(" Updated"));
		}
		
		return restResponse;
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public RestResponse deleteBarang(@PathVariable("id") String id){
		RestResponse restResponse=new RestResponse();
		int i = tagSvc.delete(id);
		if(i==CommonConstants.OK_REST_STATUS){
			restResponse.setCode(CommonConstants.OK_REST_STATUS);
			restResponse.setDesc(CommonConstants.OK_REST_DESC.concat(" Deleted"));
		}else{
			restResponse.setDesc(CommonConstants.ERROR_REST_DESC.concat(" Deleted"));
		}		
		return restResponse;
	}
	
}
