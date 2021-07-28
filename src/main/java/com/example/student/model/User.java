package com.example.student.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.NumberFormat;

@Entity
@Table(name="user1")
public class User {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		@Column(name = "user_id")
		private String userId;
		@Column(name = "name")
		private String name;
		@Column(name = "email")
		private String email;
		@Column(name = "phone")
		private String phone;
		@Column(name = "password")
		private String password;
		@Column(name = "address")
		private String address;
		@Column(name = "photo")
		private String photo;
		@Column(name = "reg_date")
		private Date regDate;
		
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhoto() {
			return photo;
		}
		public void setPhoto(String photo) {
			this.photo = photo;
		}
		public Date getRegDate() {
			return regDate;
		}
		public void setRegDate(Date regDate) {
			this.regDate = regDate;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
			

}
