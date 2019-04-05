package com.capgemini.Spring.renderer;

import com.capgemini.Spring.Provider.*;
public class MessageRenderer {
private MessageProvider messageProvider;

public void setMessageProvider(MessageProvider  messageProvider) {
		
	this.messageProvider=messageProvider;
 }

public MessageProvider getMessageProvider() {

return this.messageProvider;

}

public void render()
{
 System.out.println(messageProvider.getMessage());
}
} 