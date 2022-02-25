package com.spring.training.basic.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value ="prototype",proxyMode = ScopedProxyMode.TARGET_CLASS )
public class JdbcConnection {

	public JdbcConnection () {
		System.out.println("JDBC Connection Created");
	}
}
