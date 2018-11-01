package com.domain;
import java.io.Serializable;
import java.util.Date;
public class User implements Serializable {

	 private static final long serialVersionUID = 1510470032;

	 private Integer id;
	    private String  name;
	    private String  password;
	    private String  telephone;
	    private String  imgs;
	    private Date    lastLoginDate;
	    private Date    registerDate;
	    private String  email;
	    private Integer deleted = 0;
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
		public Integer getDeleted() {
			return deleted;
		}
		public void setDeleted(Integer deleted) {
			this.deleted = deleted;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", password=" + password + ", telephone=" + telephone
					+ ", imgs=" + imgs + ", lastLoginDate=" + lastLoginDate + ", registerDate=" + registerDate
					+ ", email=" + email + ", deleted=" + deleted + ", role=" + role + "]";
		}
		public User(Integer id, String name, String password, String telephone, String imgs, Date lastLoginDate,
				Date registerDate, String email, Integer deleted, String role) {
			super();
			this.id = id;
			this.name = name;
			this.password = password;
			this.telephone = telephone;
			this.imgs = imgs;
			this.lastLoginDate = lastLoginDate;
			this.registerDate = registerDate;
			this.email = email;
			this.deleted = deleted;
			this.role = role;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

	     
}
