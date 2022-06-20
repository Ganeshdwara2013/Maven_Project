package com.Maven_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.page_object_manager.Page_Object_Manager;
import com.pageobjectmodel.HotelSelection_Page;
import com.pageobjectmodel.Login_Page;
import com.pageobjectmodel.RadioButton_Page;
import com.properties.File_Reader_Manager;

public class Runner extends Baseclass {
	
	public static WebDriver driver = launchBrowser("chrome");		

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws IOException {
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();		
		urlLaunch(url);
		
		implicitWaitMethod();
		
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		passInput(pom.getInstanceLogin().getUsername(), username);
		
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		passInput(pom.getInstanceLogin().getPassword(), password);
		
		clickElement(pom.getInstanceLogin().getLogin());
		
		dropdownSelectByIndex(pom.getInstanceHotelSelection().getLocation(), 2);
		
		dropdownSelectByVisibleText(pom.getInstanceHotelSelection().getHotels(), "Hotel Creek");
		
		dropdownSelectByValue(pom.getInstanceHotelSelection().getRoomtype(), "Standard");
		
		dropdownSelectByIndex(pom.getInstanceHotelSelection().getRoomnos(), 3);

		String checkindate = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCheckindate();
		clearMethod(pom.getInstanceHotelSelection().getCheckindate());		
		passInput(pom.getInstanceHotelSelection().getCheckindate(), checkindate);
		
		String checkoutdate = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCheckoutdate();
		clearMethod(pom.getInstanceHotelSelection().getCheckoutdate());		
		passInput(pom.getInstanceHotelSelection().getCheckoutdate(), checkoutdate);

		dropdownSelectByIndex(pom.getInstanceHotelSelection().getAdultroom(), 3);
	
		dropdownSelectByIndex(pom.getInstanceHotelSelection().getChildroom(), 1);
	
		clickElement(pom.getInstanceHotelSelection().getSubmit());


		clickElement(pom.getInstanceRadioButton().getRadiobutton());

		clickElement(pom.getInstanceRadioButton().getConti());
		
		
		scrollToElement(pom.getInstanceDetails().getFirstname());
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstname();
		passInput(pom.getInstanceDetails().getFirstname(), firstname);
		
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastname();
		passInput(pom.getInstanceDetails().getLastname(), lastname);
				
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		passInput(pom.getInstanceDetails().getAddress(), address);
			
		String ccnum = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCcnum();
		passInput(pom.getInstanceDetails().getCcnum(), ccnum);
		
		dropdownSelectByIndex(pom.getInstanceDetails().getCctype(), 3);
		
		dropdownSelectByIndex(pom.getInstanceDetails().getCcexpmonth(), 7);

		dropdownSelectByIndex(pom.getInstanceDetails().getCcexpyear(), 12);
		
		String cccvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCccvv();
		passInput(pom.getInstanceDetails().getCccvv(), cccvv);
	
		clickElement(pom.getInstanceDetails().getBooknow());
		
		String bookingScreenshot = File_Reader_Manager.getInstanceFRM().getInstanceCR().getScreenshotMethod();
		screenshotMethod(bookingScreenshot);
		
				
		scrollToElement(pom.getInstanceLogout().getLogout());
		clickElement(pom.getInstanceLogout().getLogout());	
		
        closeBrowser();	
	}

}