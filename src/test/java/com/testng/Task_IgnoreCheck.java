package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Task_IgnoreCheck {
	
// Refer Task notes dated 4/6/2022(IST) to check what i am done here.
	
	@Test
	public void bat() {
		System.out.println("Bat");
	}

	@Test
	public void ball() {
		System.out.println("Ball");
	}

	@Ignore
	@Test
	public void cricket() {
		System.out.println("Cricket");
	}
}

