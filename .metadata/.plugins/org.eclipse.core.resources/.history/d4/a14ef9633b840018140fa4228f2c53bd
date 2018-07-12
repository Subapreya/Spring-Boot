package com.demo.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.spring.entity.Emp;
import com.demo.spring.service.HRService;

public class jdbcMain3 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(DaoConfig.class);
		HRService hrs= (HRService)ctx.getBean("HRService");
		List<Emp>  emp = hrs.getAllEmps();
		System.out.println(emp.size());
	}
}

