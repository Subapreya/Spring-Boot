package com.demo.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.EmpRepository;
import com.demo.spring.entity.Emp;

@Service
public class HRService {
	@Autowired
	EmpRepository repo;
	
	public String addEmployee(int id, String name, String address, double salary) {
		Emp resp = repo.save(new Emp(id, name, address, salary));
		return "saved";
	}
	
	
}
