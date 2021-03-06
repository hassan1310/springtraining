package com.spring.training.basic.componentscan;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value ="prototype",proxyMode = ScopedProxyMode.TARGET_CLASS )
public class ComponentJdbcConnection {

	public ComponentJdbcConnection () {
		System.out.println("JDBC Connection Created");
	}
}
