package com.innovation.Hospital_ManagementSystem.OPD.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private  Long aid;
private String email,password;
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}
public Admin(String email, String password) {
	super();
	this.email = email;
	this.password = password;
}
public Long getAid() {
	return aid;
}
public void setAid(Long aid) {
	this.aid = aid;
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


}
