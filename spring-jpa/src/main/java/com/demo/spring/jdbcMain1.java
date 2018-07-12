package com.demo.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

public class jdbcMain1 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(DaoConfig.class);
		JdbcTemplate jt = (JdbcTemplate) ctx.getBean("jt");

		int count = jt.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pst = con
						.prepareStatement("insert into emp(empno, name,address,salary) values ( ?, ?, ?, ?)");
				pst.setInt(1, 123);
				pst.setString(2, "Karthik");
				pst.setString(3, "chennai");
				pst.setDouble(4, 500);

				return pst;
			}
		});
		System.out.println("Inserted.." + count);
	}
}