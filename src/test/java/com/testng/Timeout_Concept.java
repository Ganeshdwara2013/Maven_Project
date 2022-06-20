package com.testng;

import org.testng.annotations.Test;

public class Timeout_Concept {
	
// Always we need to give additional time in timeout, not equal or same exection time or below:-
// Refer Notes for Additional Information
	@Test(timeOut = 6000) // if we give less than 6 seconds here it will fail.
	public void login() throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println("Browser Launch");
		
		Thread.sleep(1000);
		System.out.println("URL Launch");

		Thread.sleep(2000);
		System.out.println("Login");

	}

	@Test
	public void logout() {

		System.out.println("Log Out");
	}
	
}
