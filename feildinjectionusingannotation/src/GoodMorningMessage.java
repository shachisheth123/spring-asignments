package com.capgemini.spring.provider;

public class GoodMorningMessage implements MessageProvider {

	@Override
	public String getMessage()
	{
		return "Good Morning !!";
	}



} 