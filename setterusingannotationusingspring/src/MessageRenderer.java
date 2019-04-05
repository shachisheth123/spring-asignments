package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.*;

@Lazy
@Component("renderer")
public class MessageRenderer {

	private MessageProvider messageProvider;

	 @Autowired
	public void setMessageProvider(MessageProvider  messageProvider) {
		
	this.messageProvider=messageProvider;
	 }


	public void render()
	{
	
		System.out.println(messageProvider.getMessage());
	}


}