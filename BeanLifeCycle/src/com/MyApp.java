package com;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	
	

	
	
	Coach coach2=(Coach)context.getBean("myCCoach");

	
	System.out.println(coach2);
	((ClassPathXmlApplicationContext)context).close();
	
	
	System.out.println(coach2.getDailyFortune());
	
	}

}
