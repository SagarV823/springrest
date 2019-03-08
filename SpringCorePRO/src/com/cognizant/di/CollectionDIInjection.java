package com.cognizant.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionDIInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionBean cb=(CollectionBean)ioc.getBean("collection");
		System.out.println(cb);
	}

}
