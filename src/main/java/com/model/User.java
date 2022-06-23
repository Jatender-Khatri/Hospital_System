package com.model;

public class User {
	private Integer userId;
	private String fullName;
	private String email;
	private String password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer userId, String fullName, String email, String password) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
	}

	public User(String fullName, String email, String password) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.password = password;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", fullName=" + fullName + ", email=" + email + ", password=" + password
				+ "]";
	}
}
