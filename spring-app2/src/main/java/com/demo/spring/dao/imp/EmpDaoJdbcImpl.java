package com.demo.spring.dao.imp;

import com.demo.spring.entity.Emp;
import com.demo.spring.entity.dao.EmpDao;

public class EmpDaoJdbcImpl implements EmpDao{

	@Override
	public String save(Emp e) {
		return "Update: "  + e.getEmpId();
	}
	

}
