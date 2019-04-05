package com.capgemini.Spring.test;

import com.capgemini.Spring.annotation.*;
import com.capgemini.Spring.renderer.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Message{

public static void main(String[] args)
{

	//ApplicationContext context= new ClassPathXmlApplicationContext("context.xml");

	//MessageRenderer renderer=(MessageRenderer)context.getBean("renderer");

	//renderer.render();

	//using annotation
	ApplicationContext context = new AnnotationConfigApplicationContext (MessageConfiguration.class);

 	MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
	renderer .render();

	MessageRenderer renderer1 = context.getBean("renderer", MessageRenderer.class);
	System.out.println(renderer.hashCode()); // to check wheather it is singleton or not
        System.out.println(renderer1.hashCode());

}

}