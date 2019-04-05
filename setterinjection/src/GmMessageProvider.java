package com.capgemini.Spring.Provider;

public class GmMessageProvider implements MessageProvider{

	@Override
	public String getMessage()
	{
		return "Good Morning";
	}

}