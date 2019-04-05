package com.capgemini.spring.model;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Address {

	@Value("Maharashtra")
	String state;
	@Value("")
	String city;



	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state=state;	
	}

	public String getCity()
	{
		return state;
	}

	public void setCity(String city)
	{
		this.city=city;	
	}


}