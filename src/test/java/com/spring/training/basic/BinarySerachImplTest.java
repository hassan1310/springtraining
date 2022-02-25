package com.spring.training.basic;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@ContextConfiguration (locations = "/applicationContext.xml")
public class BinarySerachImplTest {

	/*
	 * @Autowired BinarySerachImpl binarySerach;
	 */
	
	@Mock
	BinarySerachImpl mock;
	
	@Test
	public void testBasicScnario() {
		when(mock.binarySearch(new int  [] {1,2}, 3)).thenReturn(5);
		int search=mock.binarySearch(new int  [] {1,2}, 3);
		assertEquals(search, 5);
		System.out.println("Test");
	}

}
