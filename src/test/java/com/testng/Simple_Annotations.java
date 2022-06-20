package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Refer Notes for Additional Information
// Since it was running upto Test, Suite was runned separately.
public class Simple_Annotations {
	
	@BeforeSuite   //Annotations
	public void propertySetting() {

		System.out.println("System.SetProperty");
	}
	
	@BeforeTest
	public void urlLaunch() {
		
		System.out.println("Launch URL");
	}
	
	@BeforeClass
	public void browserLaunch() {
		
		System.out.println("Browser Launch");
	}
	
	
	@BeforeMethod
	public void signIn() {

		System.out.println("Sign In");
	}
	
	@Test(priority = -1)
	public void men(){
		
		System.out.println("Men");
	}
	
	@Test (priority = 1, invocationCount = 2) // Invocation count
	public void women() {
		
		System.out.println("Women");
	}
	
	@Test(priority = 0) // Priority Test
	public void kids() {
		
		System.out.println("Kids");
	}
	
	@AfterMethod
	public void signOut() {

		System.out.println("SignOut");
	}
	
	@AfterClass
	public void homePage() {

		System.out.println("Home Page");
	}
	
	@AfterTest
	public void closeBrowser() {

		System.out.println("Close Browser");
	}
	
	@AfterSuite
	public void quitBrowser() {

		System.out.println("Quit Browser");
	}

}
