package com.nanosoftz.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Emirate Id", unique=true)
	private long userEmirateId;
	
	@Email
	@Column(name="Email")
	@NotNull(message="Email is required")
	private String Email;
	
	@Column(name="Username")
	private String username;
	
	@Column(name="Password")
	private String password;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	private CarTypes cartype;
	
	@OneToOne(mappedBy="user")
	private CarStatus carstatus;

	public long getUserEmirateId() {
		return userEmirateId;
	}

	public void setUserEmirateId(long userEmirateId) {
		this.userEmirateId = userEmirateId;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
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

	public CarStatus getCarstatus() {
		return carstatus;
	}

	public void setCarstatus(CarStatus carstatus) {
		this.carstatus = carstatus;
	}
	
	
}
