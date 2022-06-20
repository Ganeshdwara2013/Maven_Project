package com.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer{


// By Keeping Error message in Rerun, we need to select the first method.
// Because in Second method, we are not able to call the method, becuase interface doesn't have Object to call the method, so we are using first method.
// IRetryAnalyser is having only one method, that is the below command.
	
	/*@Override
	public boolean retry(ITestResult result) {

		return false;
	}
	
	 * */
	
	int start = 0;
	
	int end = 3; // if we changed the number here, it will run no.of times that it needs to check for failed method.
	
	@Override
	public boolean retry(ITestResult result) {

		if(start<end) {
			
			start++; // Incrementing here because, we need to specify to end the validation until this condition becomes true.
			return true; // if it is true means, it will run until it fails.			
		}	
		return false;
	}
}