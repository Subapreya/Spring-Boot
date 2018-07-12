package com.demo.spring;

import org.springframework.stereotype.Service;

@Service
public class Singer implements Performer {

	public void perform() throws PerformerException{
		
		try {
			throw new PerformerException();
		} catch (PerformerException e){
			System.out.println("In catch");
		} finally {
			System.out.println("In finally block");
		}
	 System.out.println("Singer went back.......");
		
	}
}
