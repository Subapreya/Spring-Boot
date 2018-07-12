package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx= new ClassPathXmlApplicationContext("context.xml");
		
		HRService service = (HRService) ctx.getBean("HRService");
		String resp = service.addEmployee(100, "one", "EngLand", 0.01);
		
		System.out.println("------" + resp);
	}

}
