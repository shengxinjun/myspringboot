package com.model;

import java.util.Date;

public class UserForm {
	private Integer id;
    private String  name;
    private String  password;
    private String  telephone;
    private String  imgs;
    private Date    lastLoginDate;
    private Date    registerDate;
    private String  email;
    private String  role;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getImgs() {
		return imgs;
	}
	public void setImgs(String imgs) {
		this.imgs = imgs;
	}
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "UserForm [id=" + id + ", name=" + name + ", password=" + password + ", telephone=" + telephone
				+ ", imgs=" + imgs + ", lastLoginDate=" + lastLoginDate + ", registerDate=" + registerDate + ", email="
				+ email + ", role=" + role + "]";
	}
    
    
}
