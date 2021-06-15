package com.dto;

import java.math.BigDecimal;

public class CastDto {
	
	private String moduleName;
	private String modulDesc;
	private BigDecimal orderNo;
	
	
	public CastDto(){
		
	}
	
	public CastDto(String moduleName, String modulDesc, BigDecimal orderNo ){
		this.moduleName = moduleName;
		this.modulDesc = modulDesc;
		this.orderNo = orderNo;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModulDesc() {
		return modulDesc;
	}

	public void setModulDesc(String modulDesc) {
		this.modulDesc = modulDesc;
	}

	public BigDecimal getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(BigDecimal orderNo) {
		this.orderNo = orderNo;
	}
	
	
	
	
	
	
	
	
	
}
