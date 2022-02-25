package com.spring.training.basic.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class ComponentScanImpl {
	
	public ComponentJdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(ComponentJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

	@Autowired
	ComponentJdbcConnection jdbcConnection;

	public ComponentScanImpl() {
		System.out.println("PersonDao Created");
	}
	
}
