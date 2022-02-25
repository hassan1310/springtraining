package com.spring.training.basic.springtraining;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.training.basic.scope.PersonDao;

@Configuration
@ComponentScan("com.spring.training.basic.scope")
public class SpringScopeTrainingApplication {

	private static 	Logger LOGGER=LoggerFactory.getLogger(SpringScopeTrainingApplication.class);
	public static void main(String[] args) {
		
	
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(SpringScopeTrainingApplication.class);
		
		
		PersonDao personDao=applicationContext.getBean(PersonDao.class);
		PersonDao personDao1=applicationContext.getBean(PersonDao.class);
		
		LOGGER.info("{personDao}"+ personDao);
		LOGGER.info("{jdbc connection personDao}"+ personDao.getJdbcConnection());
		
		
		LOGGER.info("{personDao1}"+ personDao1);
		LOGGER.info("{jdbc connection personDao1}"+ personDao1.getJdbcConnection());
	
		
		
	}

}
