package com.dto;


public class TagDto {
	
	private String id;
	private String label;
	private String posts;
	
	public TagDto(){
		
	}
	
	public TagDto(String id, String label, String posts ){
		this.id = id;
		this.label = label;
		this.posts = posts;
	}

	public String getId() {
		return id;
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

	public void setLabel(String label) {
		this.label = label;
	}

	public void setPosts(String posts) {
		this.posts = posts;
	}

	
}
