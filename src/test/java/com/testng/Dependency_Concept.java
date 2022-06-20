package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency_Concept {

// This concept is like, if a particular method needs to be run, the dependency Test need to pass.
// If we cleared 10th standard only, we can enter into 12th standard.
// If we are not passed in 10th standard, we are unable to join in 12th standard.
// Here, the result will shows exception as the method is not passed to perform 12th.
// @Ignore is used to exclude the method.
// "depondsOnMethods" is used to assign the dependency topic here.
	
	@Ignore   // this line is for, to exlcude to see if twelth is running or not.
	@Test
	public void tenth() {
		System.out.println("Tenth Pass");
	}
	
	@Test(dependsOnMethods = "tenth")
	public void twelth() {
		System.out.println("Twelth Continuation");
	}
	
	
}
