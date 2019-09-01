package com.tanuj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Roles")
public class Roles {
	@Id
	@Column(name="RoleId")
	private int roleId;
	@Column(name="Add_Access")
	private String addAccess;
	@Column(name="Edit_Access")
	private String editAccess;
	@Column(name="Delete_Access")
	private String deleteAccess;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getAddAccess() {
		return addAccess;
	}
	public void setAddAccess(String addAccess) {
		this.addAccess = addAccess;
	}
	public String getEditAccess() {
		return editAccess;
	}
	public void setEditAccess(String editAccess) {
		this.editAccess = editAccess;
	}
	public String getDeleteAccess() {
		return deleteAccess;
	}
	public void setDeleteAccess(String deleteAccess) {
		this.deleteAccess = deleteAccess;
	}

	
	
}
