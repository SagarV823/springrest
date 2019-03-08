package com.cognizant.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
		Greeting greeting=(Greeting)ioc.getBean("greeting");
		System.out.println(greeting.sayHello("Sagar"));
		
		Greeting greeting1=(Greeting)ioc.getBean("greeting1");
		System.out.println(greeting1.sayHello("Sagar"));
		
		Greeting greeting2=(Greeting)ioc.getBean(Greeting.class);
		System.out.println(greeting2.sayHello("Amit"));
	}

}
