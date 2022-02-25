package com.spring.training.basic.springtraining;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.training.basic.BinarySerachImpl;


@Configuration
@ComponentScan("com.spring.training.basic")
public class SpringBasicTrainingApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(SpringBasicTrainingApplication.class);
		
		
		BinarySerachImpl binarySerach=applicationContext.getBean(BinarySerachImpl.class);
		BinarySerachImpl binarySerach1=applicationContext.getBean(BinarySerachImpl.class);
		System.out.println(binarySerach);
		System.out.println(binarySerach1);
		int index=binarySerach.binarySearch(new int [] {10,5,3,2}, 2);
		System.out.println("The result index is : "+index);
		
		
	}

}
