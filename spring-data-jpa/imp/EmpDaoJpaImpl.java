package com.demo.spring.dao.imp;

import com.demo.spring.entity.Emp;
import com.demo.spring.entity.dao.EmpDao;

public class EmpDaoJpaImpl implements EmpDao{

	@Override
	public String save(Emp e) {
		return "Update from JPA: "  + e.getEmpId();
	}
	

}