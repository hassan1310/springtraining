package com.spring.training.basic.springtraining;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.training.basic.componentscan.ComponentScanImpl;

@Configuration
@ComponentScan("com.spring.training.basic.springtraining")
public class SpringComponentScanTrainingApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringScopeTrainingApplication.class);

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringScopeTrainingApplication.class);

		ComponentScanImpl componentScan = applicationContext.getBean(ComponentScanImpl.class);

		LOGGER.info("{personDao}" + componentScan);
		LOGGER.info("{jdbc connection componentScan}" + componentScan.getJdbcConnection());

		applicationContext.close();

	}

}
