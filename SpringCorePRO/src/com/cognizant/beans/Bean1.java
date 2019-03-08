package com.cognizant.beans;

//this class provide infrastructure services for eg Security,Tracing,Debugging,Performance,Monitoring
//Persistence, Database operations etc;

//Spring bean is infrastructure service class which provide above mentioned infrastructure services
//Spring bean object life cycle are managed by IOC Container(Loosely coupled container)
//Information(configuration) required to manage life cycle of 
//Spring bean must be provided either in using XML or annotation
public class Bean1 {

	//Method provides some infrastructure 
	public void x()
	{
		System.out.println("x Called");
	}
}
