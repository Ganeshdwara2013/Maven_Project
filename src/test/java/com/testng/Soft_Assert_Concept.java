package com.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Concept {
	
// SoftAssert is also known as Verification.
// It will Verify the Validation and continue even if validation is failed.
// SoftAssert soft = new SoftAssert();
// It will Just verify, even it fails, it will give any error message(or) error.
// In Real-time, we will not use this much.

	@Test
	public void demo() {

		String actual = "Hema";
		
		String expected = "hema";
		
		SoftAssert s = new SoftAssert();
		
		s.assertEquals(actual, expected);
	
		System.out.println("Verification");
	}
}