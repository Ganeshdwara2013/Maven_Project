package com.testng;

import org.testng.annotations.Test;

public class Expected_Exceptions_Concept {
	
// We Shouldnot give only "Exception" as expected, because it is parent, it will allow all the exceptions.
// We need to particularly what expected exception needs to be thrown.
// Refer Notes for Additional Info.

// We are not supposed to give Any other Exception(Like Null Pointer Exception) in demo method, because we need to give the exact exception as we expect  
	
	@Test(expectedExceptions = ArithmeticException.class) //.class is extension of Exceptions
	public void demo() {

		int a = 20;
		
		System.out.println(a/0); // if we give 2 here it will pass, because any number/0 will throw Arithmetic exception.
		
	}
}
