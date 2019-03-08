package com.cognizant.demo;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.cognizant.beans.Bean1;
import com.cognizant.beans.Bean2;
import com.cognizant.beans.Bean3;
import com.cognizant.beans.Bean4;
import com.cognizant.beans.Bean5;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bean1 bean1=new Bean1();
		bean1.x();
		//loosely coupled code
		Resource resource=new ClassPathResource("applicationContext.xml");
		//Pure IOC Container BeanFactory
		//Usage of BeanFactory is limited to creating instance of Spring Bean based on configuration informationin XML 
		BeanFactory iocl=new XmlBeanFactory(resource);
		Bean1 bean11=(Bean1)iocl.getBean("bean1");
		bean11.x();
		//ApplicationContext is super set of BeanFactory apart from providing injection
		ApplicationContext ioc2=new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean1 bean12=(Bean1)ioc2.getBean("bean1");
		bean12.x();
		Bean1 bean13=(Bean1)ioc2.getBean("bean1");
		
		
		if(bean12==bean13)
		{
			System.out.println("Indeed Singleton design pattern");
		}
		//by default singleton bean are eagerly loaded
		//lazy loading by specifying lazy init-true
		Bean2 bean2=(Bean2)ioc2.getBean("bean2");
		
		Bean3 bean31=(Bean3)ioc2.getBean("bean3");
		
		Bean3 bean32=(Bean3)ioc2.getBean("bean3");
		if(bean31==bean32)
		{
			System.out.println("will not be printed");
		}
		//Multiple configuration files in class path
		//Assume applicationContext1.xml.applicationContext2.xml
		
		//ApplicationContext ioc=new ClassPathXmlApplicationContext(new String[]{"application1.xml","application2.xml")};
		//Cofiguration file outside classpath
		ApplicationContext ioc3=new FileSystemXmlApplicationContext("C:\\CognizantConfig\\beans.xml");
		Bean3 bean3=(Bean3)ioc3.getBean("bean3");
		
		AbstractApplicationContext ioc4=new ClassPathXmlApplicationContext("applicationContext.xml");
		//init and destroy method
		Bean4 bean4=(Bean4)ioc4.getBean("bean4");
		ioc4.registerShutdownHook();
		
		ApplicationContext ioc5=new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean5 bean5=(Bean5)ioc5.getBean("bean5");
		
	}

}
