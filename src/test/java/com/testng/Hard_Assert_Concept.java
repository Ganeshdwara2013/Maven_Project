package com.testng;

import static org.junit.Assert.assertSame;
import static org.testng.Assert.assertEquals;
import org.junit.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Concept {

// Assert is of two types:-
// Hard Assert and Soft Assert
// Return type is "Assert " is boolean.
//  Hard Assert - Validation.
//  Soft Assert - Verification(we will not use much in Real-time).
//  Here we use Hard_Assert Concept.
// Hard Assert will stop execution if the test is failed.
// Hard Assert will not continue the execution.
// Different types of methods used below.
	
	@Test
	public void demo() {

		String expected = "Hema";
		
		String actual = "Hema"; // if we "hema" it will fails
		
		Assert.assertEquals(actual, expected);
		
		System.out.println("Validation");
	}
	
	@Test
	public void demo1() {

		String unexpected = "Hema";
		
		String actual = "hema"; 
		
		Assert.assertNotEquals(unexpected, actual);
				
		System.out.println("Validation1");
	}
	
	@Test
	public void demo2() {

		String expected = "Hema";
		
		String actual = "Hema"; 
		
		Assert.assertSame(expected, actual);
		
		System.out.println("Validation2");
	}
	
	@Test
	public void demo3() {
		
		String nullValue = null; 
		
		Assert.assertNull(nullValue);
		
		System.out.println("Validation3");
	}
	
	@Test
	public void demo4() {

		String notNullValue = "Hema";
				
		Assert.assertNotNull(notNullValue);
		
		System.out.println("Validation4");
	}
	
	@Test
	public void demo5() {

		int a = 10/2;
		
		int b = 5;
		
		Assert.assertTrue(a==b);
		
		System.out.println("Validation5");
	}

	@Test
	public void demo6() {

		int a = 10/2;
		
		int b = 6;
		
		Assert.assertFalse(a==b);
		
		System.out.println("Validation6");
	}
}