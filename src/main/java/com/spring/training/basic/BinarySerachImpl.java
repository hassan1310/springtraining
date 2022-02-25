package com.spring.training.basic;

/*import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;*/

//import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class BinarySerachImpl {
	
	//private Logger log = LoggerFactory.getLogger(BinarySerachImpl.class);
	@Autowired

	SortAlgorithm bubbleSortImpl;
	
	public BinarySerachImpl() {
		//log.info("----------- BinarySerachImpl object Created ------------");
	}
	public void setAlgorithm(SortAlgorithm algorithm) {
		this.bubbleSortImpl = algorithm;
	}
	public int binarySearch (int [] numbers , int numberTosearch) {
		
		int sortedList []=bubbleSortImpl.sort(numbers);
		// searching logic
		
		return 3;
	}
	/*
	 * @PostConstruct public void postConstruct() {
	 * log.info("----------- postconstruct object called ------------"); }
	 * 
	 * @PreDestroy public void preDestroy() {
	 * log.info("----------- preDestroy object called ------------"); }
	 */
}
