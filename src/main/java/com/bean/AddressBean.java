package com.bean;

public class AddressBean {

	String city,country;

	public AddressBean() {
		System.out.println("addressBean instance created");
	}
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
