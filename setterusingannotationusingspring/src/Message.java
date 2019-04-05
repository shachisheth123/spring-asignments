package com.capgemini.spring.message;

import  com.capgemini.spring.renderer.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Message {


	public static void main(String[] args){

	ApplicationContext context= new ClassPathXmlApplicationContext("context.xml");

	MessageRenderer renderer=context.getBean(MessageRenderer.class);
	renderer.render();

	System.out.println(renderer.hashCode());

	MessageRenderer renderer1=context.getBean(MessageRenderer.class);

	System.out.println(renderer1.hashCode());	

	


}
}