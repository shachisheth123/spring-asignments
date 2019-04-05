package com.capgemini.spring.test;

import com.capgemini.spring.configuration.*;
import com.capgemini.spring.renderer.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Message
{
	public static void main(String[] args)
	{

	//ApplicationContext context= new ClassPathXmlApplicationContext("context.xml");

	//MessageRenderer renderer=(MessageRenderer)context.getBean("renderer");

	//System.out.println(renderer.hashCode());

	//MessageRenderer renderer1=(MessageRenderer)context.getBean("renderer");

	//System.out.println(renderer1.hashCode());	

	//renderer.render();


	//constructor using annotation
	
	ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfiguration.class);

 	MessageRenderer renderer = context.getBean(MessageRenderer.class);
	renderer.render();

	MessageRenderer renderer1 = context.getBean( MessageRenderer.class);
	System.out.println(renderer.hashCode()); // to check wheather it is singleton or not
        System.out.println(renderer1.hashCode());

	}
}

