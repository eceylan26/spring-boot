package com.examples.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("file:src/com/examples/spring/beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		// check if they are the same bean
		boolean result = (theCoach==alphaCoach);

		// print the result
		System.out.println("Pointing to the same object ---> " + result);

		System.out.println("Memory location of theCoach ---> " + theCoach);
		
		System.out.println("Memory location of alphaCoach ---> " + alphaCoach);
		
		context.close();
	}

}
