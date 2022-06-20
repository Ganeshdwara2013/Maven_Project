package com.testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class Transform implements IAnnotationTransformer {
	
// IAnnotationTransformer will not show error in class name as like IRetryAnalyser, becuase, it is having more than 1 method, but IRetryAnalyser is having only one method.
// This Class basically used to call the method which is having default conditions if test fails.
// Also, the "IAnnotationTransformer" will call the failed methods in that entire class that we are denoting(Ex - Retry_Demo Here).

	
// While entering the "transform" notation(method), we need to select the 5th method in usual.

	/* @Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
	} 
	* */
	
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
	
		annotation.setRetryAnalyzer(Rerun.class);  // this line is used to set the Retryanalyser to which the method needs to do, if methods in main class(Retry_Demo) Fails.
	
	}
}