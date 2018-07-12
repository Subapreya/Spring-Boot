package com.demo.spring;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {

	@Pointcut("execution(* com.demo.spring.Singer.perform(..))")
	private void pcut(){}
	
	@Before("pcut()")
	public void switchOffMob() {
		System.out.println("Switched OFF");
	}
	
	@Before("pcut()")
	public void takeSeat() {
		System.out.println("Audience take seat...");
	}
	
	@AfterReturning("pcut()")
	public void applaud() {
		System.out.println("clap..clap..");
	}
}
