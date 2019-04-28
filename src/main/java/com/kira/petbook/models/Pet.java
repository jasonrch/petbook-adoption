package com.kira.petbook.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pet {

	@Column(name="names")
	private String name;
	@Column(name="species")
	private String species;
	@Column(name="pet_descriptions")
	private String petDescription;
	@Column(name="health_descriptions")
	private String healthDescription;
	@Column(name="ages")
	private String age;
	@Column(name="medias")
	private String media;
	@Column(name="pet_id")
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long petID;
	@ManyToOne
	@JoinColumn(name = "owner_id")
	private Owner owner;
	
	public Pet() {};
	
	//  Getters
	public String getName() {
		return this.name;
	}
	public String getSpecies() {
		return this.species;
	}
	public String getPetDescription() {
		return this.petDescription;
	}
	public String getHealthDescription() {
		return this.healthDescription;
	}
	public String getAge() {
		return this.age;
	}
	public String getMedia() {
		return this.media;
	}
	public Long getPetID() {
		return this.petID;
	}
	public Owner getOwner() {
		return this.owner;
	}
	
	//  Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public void setPetDescription(String petDescription) {
		this.petDescription = petDescription;
	}
	public void setHealthDescription(String healthDescription) {
		this.healthDescription = healthDescription;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setMedia(String media) {
		this.media = media;
	}
	
}