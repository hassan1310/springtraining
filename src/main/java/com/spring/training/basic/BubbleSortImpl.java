package com.spring.training.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class BubbleSortImpl implements SortAlgorithm {

	
	@Override
	public int[] sort(int[] nummbers) {
		// add bubble sort logic
		return nummbers;
	}
}
