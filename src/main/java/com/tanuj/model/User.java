package com.tanuj.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {
	@Id
	@GeneratedValue
	@JsonIgnore
	@Column(name="UserId")
	private Long userId;
	@Column(name="UserEmail")
	private String userEmail;
	@Column(name="Roles")
	private String roles;
	@Column(name="Organization")
	private String organization;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}


}
