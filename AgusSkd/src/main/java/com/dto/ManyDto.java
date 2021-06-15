package com.dto;

import java.math.BigDecimal;

public class ManyDto {
	
	
	private String id;
	private String content;
	private String tags;
	private String title;
	private String label;
	private String posts;
	
	public ManyDto(){
		
	}
	
	public ManyDto(String id, String content, String tags, String title, String label, String posts ){
		this.id = id;
		this.content = content;
		this.tags = tags;
		this.title = title;
		this.label = label;
		this.posts = posts;
	}

	public String getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public String getTags() {
		return tags;
	}

	public String getTitle() {
		return title;
	}

	public String getLabel() {
		return label;
	}

	public String getPosts() {
		return posts;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void setPosts(String posts) {
		this.posts = posts;
	}

	
	
	
}
