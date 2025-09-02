package com.gmit.onlinejob.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class company {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String email;
	    private String name;
	    private String website;
	    private String password;
	    private String contact;
	    private String location;

	    // Constructors
	    public company() {
	        super();
	    }

	    public company(Long id, String email, String name, String website, String password, String contact, String location) {
	        super();
	        this.id = id;
	        this.email = email;
	        this.name = name;
	        this.website = website;
	        this.password = password;
	        this.contact = contact;
	        this.location = location;
	    }

	    public company(String email, String name, String website, String password, String contact, String location) {
	        super();
	        this.email = email;
	        this.name = name;
	        this.website = website;
	        this.password = password;
	        this.contact = contact;
	        this.location = location;
	    }

	    // Getters and Setters
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

	    public String getWebsite() {
	        return website;
	    }

	    public void setWebsite(String website) {
	        this.website = website;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
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
	
}
