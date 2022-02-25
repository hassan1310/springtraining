package com.spring.training.basic.springtraining;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.training.basic.properties.ExternalProperties;

@Configuration
@ComponentScan("com.spring.training.basic.properties")
@PropertySource("classpath:app.properties")
public class SpringPropertiesApplication {

	private static 	Logger LOGGER=LoggerFactory.getLogger(SpringPropertiesApplication.class);
	public static void main(String[] args) {
		
	
		AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext(SpringPropertiesApplication.class);
		
		
		ExternalProperties service=applicationContext.getBean(ExternalProperties.class);
		
		LOGGER.info( " ",service);
		LOGGER.info(service.getServiceUrl());
		
		
	
		applicationContext.close();		
	}

}
