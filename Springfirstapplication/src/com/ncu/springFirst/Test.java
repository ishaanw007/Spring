package com.ncu.springFirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
Iworker sw=(Iworker)context.getBean("Iwork");
//LazyWorker lw=new LazyWorker();
ManageWorker mw=new ManageWorker(sw);
mw.manageWorker();
	}

}
