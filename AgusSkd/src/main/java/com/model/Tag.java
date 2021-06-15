package com.model;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the TAG database table.
 * 
 */
@Entity
@Table(name="TAG")
@NamedQuery(name="Tag.findAll", query="SELECT t FROM Tag t")
public class Tag implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String label;
	private String posts;

	public Tag() {
	}

	@Id
	@Column(name="ID")
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}


	@Column(name="\"LABEL\"")
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Column(name="POSTS")
	public String getPosts() {
		return this.posts;
	}

	public void setPosts(String posts) {
		this.posts = posts;
	}

}