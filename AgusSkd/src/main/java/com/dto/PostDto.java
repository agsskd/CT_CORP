package com.dto;



public class PostDto {
	
	private String content;
	private String id;
	private String tags;
	private String title;

	
	
	public PostDto(){
		
	}
	
	public PostDto(String content, String id, String tags ){
		this.content = content;
		this.id = id;
		this.tags = tags;
	}

	public String getId() {
		return id;
	}

	public String getTags() {
		return tags;
	}

	public String getTitle() {
		return title;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	
}
