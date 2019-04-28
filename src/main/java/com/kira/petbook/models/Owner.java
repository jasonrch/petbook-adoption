package com.kira.petbook.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Owner {

	@Column(name="complete_name")
	private String completeName;
	@Column(name="addresses")
	private String address;
	@Column(name="cities")
	private String city;
	@Column(name="emails")
	private String email;
	@Column(name="passwords")
	private String password;
	@Column(name="phones")
	private Integer phone;
	@Column(name="owner_id")
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long ownerID;
	@Column(name="pet_id")
	@OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
	private List<Pet> pets;
	
	//  Constructor
	protected Owner() {}
	public Owner(String completeName, String address, String city, String email, String password, Integer phone) {
		this.completeName = completeName;
		this.address = address;
		this.city = city;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	
	//  Getters
	public String getCompleteName() {
		return this.completeName;
	}
	public String getAddress() {
		return this.address;
	}
	public String getCity() {
		return this.city;
	}
	public String getEmail() {
		return this.email;
	}
	public String getPassword() {
		return this.password;
	}
	public Integer getPhone() {
		return this.phone;
	}
	public Long getOwnerID() {
		return this.ownerID;
	}
	public List<Pet> getPets() {
		return this.pets;
	}
	
}
