package com.model;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the POST database table.
 * 
 */
@Entity
@Table(name="POST")
@NamedQuery(name="Post.findAll", query="SELECT p FROM Post p")
public class Post implements Serializable {
	private static final long serialVersionUID = 1L;
	private String content;
	private String id;
	private String tags;
	private String title;

	private String label;
	private String posts;
	
	
	
	@ManyToMany
	@JoinColumn(name="posts")
	private Tag tag;


	
	public Post() {
	}
	
	   
	@Column(name="CONTENT")
	public String getContent() {
		return content;
	}
	@Id
	@Column(name="ID")
	public String getId() {
		return id;
	}
	@Column(name="TAGS")
	public String getTags() {
		return tags;
	}
	@Column(name="TITLE")
	public String getTitle() {
		return title;
	}

	public void setContent(String content) {
		this.content = content;
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


	public String getLabel() {
		return label;
	}


	public String getPosts() {
		return posts;
	}


	public Tag getTag() {
		return tag;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public void setPosts(String posts) {
		this.posts = posts;
	}


	public void setTag(Tag tag) {
		this.tag = tag;
	}


	

}