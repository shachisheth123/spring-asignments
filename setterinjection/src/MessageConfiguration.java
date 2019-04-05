package com.capgemini.Spring.annotation;

import com.capgemini.Spring.Provider.*;
import com.capgemini.Spring.renderer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.*;

@Configuration
public class MessageConfiguration{

	@Lazy
	@Bean
	public MessageProvider provider()
	{
		return new HelloWorldMessageProvider();
	}

	@Lazy
	@Bean
 	public MessageRenderer renderer(){

 	MessageRenderer renderer = new MessageRenderer();
 	renderer.setMessageProvider(provider());
 	return renderer;
	
	 }





}