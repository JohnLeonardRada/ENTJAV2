package model;

import javax.persistence.Embeddable;

/*
 Defines a class whose instances are stored as an intrinsic part of an owning entity 
 and share the identity of the entity. Each of the persistent properties or fields of 
 the embedded object is mapped to the database table for the entity. 
 */

/*
The main difference between entities and value objects lies in the way we 
compare their instances to each other. The concept of identifier equality 
refers to entities, whereas the concept of structural equality - to value objects. 
In other words, entities possess inherent identity while value objects don't. 
 */
@Embeddable
public class Address {
	private String street;
	private String city;
	private String region;
	private int zip;
	
	public Address() {
	}

	public Address(String street, String city, String region, int zip) {
		this.street = street;
		this.city = city;
		this.region = region;
		this.zip = zip;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
}
