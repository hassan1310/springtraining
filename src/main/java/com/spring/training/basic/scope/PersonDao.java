package com.spring.training.basic.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class PersonDao {
	
	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

	@Autowired
	JdbcConnection jdbcConnection;

	public PersonDao() {
		System.out.println("PersonDao Created");
	}
	
}
