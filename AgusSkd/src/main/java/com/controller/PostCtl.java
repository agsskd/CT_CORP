package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import response.RestResponse;

import com.dto.PostDto;
import com.service.PostSvc;
import com.util.CommonConstants;

@RestController
@RequestMapping("/post")
public class PostCtl {
	
	@Autowired
	private PostSvc postSvc;
	
	@RequestMapping(value="/all" , method = RequestMethod.GET)	
	public RestResponse getAll(){
		RestResponse restResponse=new RestResponse();
		restResponse.setCode(CommonConstants.OK_REST_STATUS);
		restResponse.setDesc(CommonConstants.OK_REST_DESC);
		restResponse.setModules(postSvc.getAll());
		restResponse.setTotalRecords(postSvc.getAll().size());
		return restResponse;
	}
	
	
	
	@RequestMapping(value="/one/{id}",method=RequestMethod.GET)
	public RestResponse getOneBarang(@PathVariable ("id") String id){
		PostDto postDto=new PostDto();
		postDto=postSvc.getOne(id);
		RestResponse restResponse=new RestResponse();
		restResponse.setModules(postDto);
		restResponse.setCode(CommonConstants.OK_REST_STATUS);
		restResponse.setDesc(CommonConstants.OK_REST_DESC);
		return restResponse;
	}
	
	@RequestMapping(value="/save" ,method = RequestMethod.POST)
	public RestResponse save(@RequestBody PostDto postDto) {
		RestResponse restResponse = new RestResponse();
		int i = postSvc.save(postDto);
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
	public RestResponse update(@RequestBody PostDto postDto){
		RestResponse restResponse=new RestResponse();
		int i= postSvc.update(postDto);
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
		int i = postSvc.delete(id);
		if(i==CommonConstants.OK_REST_STATUS){
			restResponse.setCode(CommonConstants.OK_REST_STATUS);
			restResponse.setDesc(CommonConstants.OK_REST_DESC.concat(" Deleted"));
		}else{
			restResponse.setDesc(CommonConstants.ERROR_REST_DESC.concat(" Deleted"));
		}		
		return restResponse;
	}
	
}
