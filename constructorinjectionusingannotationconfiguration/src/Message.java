package com.capgemini.spring.message;

import com.capgemini.spring.renderer.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Message{

	public static void main(String[] args){

	ApplicationContext context= new ClassPathXmlApplicationContext("context.xml");

	MessageRenderer renderer=(MessageRenderer)context.getBean("renderer");

	System.out.println(renderer.hashCode());

	MessageRenderer renderer1=(MessageRenderer)context.getBean("renderer");

	System.out.println(renderer1.hashCode());	

	renderer.render();


	}


}