package com.gmit.gmit_onlinejobs.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="company")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email, name, password, website, contact, location;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Company() {
		super();
	}
	public Company(String email, String name, String password, String website, String contact, String location) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.website = website;
		this.contact = contact;
		this.location = location;
	}
	public Company(Long id, String email, String name, String password, String website, String contact,
			String location) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
		this.website = website;
		this.contact = contact;
		this.location = location;
	}
	
	
}
