package com.capgemini.spring.model;

public class Address {

	String cityName;
 	
	String state;

	public Address(String cityName, String state ) {
		
		this.cityName = cityName;
		this.state = state;
		

	}
	
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}



}