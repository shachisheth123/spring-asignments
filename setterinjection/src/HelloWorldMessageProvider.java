package com.capgemini.Spring.Provider;
public class HelloWorldMessageProvider implements MessageProvider{

	@Override
	public String getMessage()
	{
		return "Hello World";
	}

}
