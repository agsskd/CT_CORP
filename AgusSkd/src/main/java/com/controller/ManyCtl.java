package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import response.RestResponse;

import com.dao.ManyDao;
import com.util.CommonConstants;


@RestController
@RequestMapping("/many")
public class ManyCtl {

	@Autowired
	private HttpServletRequest httpServletRequest;
	
	@Autowired
	private ManyDao manyDao;
	
	
	@RequestMapping(value="/all" , method = RequestMethod.GET)	
	public RestResponse getAll(){
		RestResponse restResponse=new RestResponse();		
		restResponse.setCode(CommonConstants.OK_REST_STATUS);
		restResponse.setModules(manyDao.getAllMultiple());
		restResponse.setTotalRecords(manyDao.getAllMultiple().size());
		if(restResponse.getTotalRecords() > 0){
			restResponse.setCode(CommonConstants.OK_REST_STATUS);
			restResponse.setDesc(CommonConstants.OK_REST_DESC);
		}else{
			restResponse.setCode(CommonConstants.ERROR_REST_STATUS);
			restResponse.setDesc(CommonConstants.ERROR_REST_DESC);
		}
		return restResponse;
		
		
	}
}
