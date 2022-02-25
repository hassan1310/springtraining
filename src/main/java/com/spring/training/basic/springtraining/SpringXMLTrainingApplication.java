package com.spring.training.basic.springtraining;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringXMLTrainingApplication {

	private static 	Logger LOG=LoggerFactory.getLogger(SpringXMLTrainingApplication.class);
	public static void main(String[] args) {
		
	
		ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		/*
		 * XMLPersonDao personDao=applicationContext.getBean(XMLPersonDao.class);
		 * 
		 * LOGGER.info("{personDao}"+ personDao);
		 * LOGGER.info("{jdbc connection personDao}"+ personDao.getJdbcConnection());
		 */
		
		String [] beansNames =applicationContext.getBeanDefinitionNames();
		for (int i = 0; i < beansNames.length; i++) {
			LOG.info("----------------"+beansNames[i]);
		}
		
		applicationContext.close();
	
		
		
	}

}
