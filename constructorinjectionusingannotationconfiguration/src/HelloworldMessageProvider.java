package com.capgemini.spring.provider;

import com.capgemini.spring.provider.*;
import org.springframework.stereotype.Component;

//@Component("provider")
public class HelloworldMessageProvider implements MessageProvider {


	@Override
	public String getMessage()
	{
		return "Hello world";
	} 



}