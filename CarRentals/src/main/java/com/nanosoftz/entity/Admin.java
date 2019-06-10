package com.nanosoftz.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Admin {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Emirate Id")
	@NotEmpty
	private long adminEmirateId;
	
	@Column(name="Email", unique=true)
	@Email(message="Email field should not be empty")
	@NotEmpty
	private String email;
	
	@Column(name="Username")
	@NotEmpty
	private String username;
	
	@Column(name="Password")
	@NotEmpty(message="password filled must not be empty")
	@Size(min=6, message="password must be more than 6 characters")
	private String password;
	
	@OneToMany(mappedBy="admin", cascade=CascadeType.ALL)
	private CarTypes cartype;
	
	@OneToMany(mappedBy="admin", cascade=CascadeType.ALL)
	private CarStatus carstatus;

	public Long getAdminEmirateId() {
		return adminEmirateId;
	}

	public void setAdminEmirateId(Long adminEmirateId) {
		this.adminEmirateId = adminEmirateId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CarTypes getCartype() {
		return cartype;
	}

	public void setCartype(CarTypes cartype) {
		this.cartype = cartype;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAdminEmirateId(long adminEmirateId) {
		this.adminEmirateId = adminEmirateId;
	}

	public CarStatus getCarstatus() {
		return carstatus;
	}

	public void setCarstatus(CarStatus carstatus) {
		this.carstatus = carstatus;
	}
	
	
	
}
