package com.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USER_ID database table.
 * 
 */
@Entity
@Table(name="USER_ID")
@NamedQuery(name="UserId.findAll", query="SELECT u FROM UserId u")
public class UserId implements Serializable {
	private static final long serialVersionUID = 1L;
	private String userId;
	private String userName;
	private String userPass;

	public UserId() {
	}


	@Id
	@Column(name="USER_ID")
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


	@Column(name="USER_NAME")
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	@Column(name="USER_PASS")
	public String getUserPass() {
		return this.userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

}