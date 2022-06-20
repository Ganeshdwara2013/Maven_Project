package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_Demo {

// IRetry Analyser is one of the features of TestNG
// There are two methods here IRetryAnalyzer and IAnnotation Transformer
// Both are Interface.
// Usually IRetry Analyser was used for Network issue, Server issue and page not loading issue,etc.,
// IRetry is specifically we need to only one method and we need to specify the method.
// IAnnotation transformer is basically creating a class and it will check every method within the class.
// <Listener> tag is used in IRetryAnnotations.
// <Listener> must be used in between the suite and test.

	
// In this topic we used two classes
// Rerun class and Transform class.
// Once the above two classes created means, we need to call the method by using (.xml file).
 
	@Test
	public void username() {

		String expected = "Vimala";
		
		String actual = "Vimala";
		
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test   // Here we can use "(retryAnalyzer = Rerun.class)" to run and check for sometime, but usually, we use IRetry Annotations, because, it will check all the fails(methods fails i.e., to avoid giving all the failed methods separately) in that class if we declared that in Different class(Transfrom class).
	public void password() {

		String actual = "123";
		
		String expected = "456";
		
		Assert.assertEquals(actual, expected);
		
	}
	
	
	@Test
	public void gmail() {

		String expected = "Vimala@gmail.com";
		
		String actual = "Vimala@yahoo.com";
		
		Assert.assertEquals(actual, expected);
		
	}
}