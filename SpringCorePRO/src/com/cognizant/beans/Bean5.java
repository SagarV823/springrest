package com.cognizant.beans;

public class Bean5 {
	
	public Bean5(){
		System.out.println("--Bean5--");
	}
	public static Bean5 createInstance(){
		
		System.out.println("--createInstance--");
		Bean5 bean5=new Bean5();
		return bean5;
	}
}
