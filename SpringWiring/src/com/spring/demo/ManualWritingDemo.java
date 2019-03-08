package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Bean1;

public class ManualWritingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean1 bean1=(Bean1)ioc.getBean("bean1");
		bean1.xBean1Method();
		
	}
}
