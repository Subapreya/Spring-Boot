package com.demo.spring.dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.demo.spring.entity.Emp;
import com.demo.spring.entity.dao.EmpDao;

@Repository
public class EmpDaoJdbcImpl implements EmpDao{

	@Autowired
	JdbcTemplate jt;
	
	
	@Override
	public String save(Emp e) {
		
		return null;
	}

	@Override
	public String delete(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(Emp e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Emp findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public List<Emp> getAll() {
		List<Emp> empList = jt.query("select * from emp", new RowMapper<Emp>() {

			@Override
			public Emp mapRow(ResultSet rs, int index) throws SQLException {
				// TODO Auto-generated method stub
				return new Emp(rs.getInt("EMPNO"),
						rs.getString("NAME"),
						rs.getString("ADDRESS"),
						rs.getDouble("SALARY")
						);
			}
			
		});
		return empList;
	}
	

}
