package com.ncu.cricket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	Coach coach=(Coach)context.getBean("myTCoach",TennisCoach.class);
	((TennisCoach) coach).setRoll("six");
	System.out.println(coach.toString());
	
	
	Coach coach4=(Coach)context.getBean("myTCoach",TennisCoach.class);
	
	System.out.println(coach4.toString());
	
	Coach coach1=(Coach)context.getBean("myBCoach");
	Coach coach2=(Coach)context.getBean("myCCoach");
	Coach coach3=(Coach)context.getBean("add");
	
	System.out.println(coach2);
	System.out.println(coach3);
	
	System.out.println(coach.getDailyWorkout());
//	System.out.println(coach4.getDailyFortune());
	System.out.println(coach1.getDailyFortune());
	}

}
