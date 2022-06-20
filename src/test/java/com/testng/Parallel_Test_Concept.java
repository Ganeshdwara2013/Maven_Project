package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Test_Concept {
	
// This test will run at the same time if we select as parallel mode
/* right click(the class) --> TestNG --> Convert to TestNG---> select "Parallel Mode" 
 (OR) convert to xml file and select the parallel tag as name "methods" and run
	*/
//  Both will run at a same time.
	
	@Test
	public void facebook() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\Maven_Project\\Driver\\cdeem\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	System.out.println("Facebook");
	}
	

	@Test
	public void instagram() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\Maven_Project\\Driver\\cdeem\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.instagram.com/");
		
	System.out.println("Instagram");
	
	}
}