package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Task_Parameterized {
	
	@Test
	@Parameters({"username","password"})
	public void task(String username, String password) {

		System.out.println(username);
		
		System.out.println(password);
	}

}
