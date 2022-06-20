package com.page_object_manager;

import org.openqa.selenium.WebDriver;
import com.pageobjectmodel.Details_Page;
import com.pageobjectmodel.HotelSelection_Page;
import com.pageobjectmodel.Login_Page;
import com.pageobjectmodel.Logout_Page;
import com.pageobjectmodel.RadioButton_Page;

public class Page_Object_Manager {
	
	// private datatype variable;
	// private WebElement refName;
	// private classname objectname;
	
	public WebDriver driver; // null
	
	private Login_Page lp; // null

	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver=driver2;
	}

	public Login_Page getInstanceLogin() {
		
		if(lp ==null ) {
			
			lp = new Login_Page(driver);
		}
		return lp;
	}

	private HotelSelection_Page hp;
	
	public HotelSelection_Page getInstanceHotelSelection() {
		
		if(hp == null) {
			
			hp = new HotelSelection_Page(driver);
		}
		return hp;
	}
	
	private RadioButton_Page rp;
	
	public RadioButton_Page getInstanceRadioButton() {
	
	if(rp ==null) {
		
		rp = new RadioButton_Page(driver);
	
	}
	return rp;
	
	}
	
	private Details_Page dp;
	
	public Details_Page getInstanceDetails() {
	
	if(dp ==null) {
		
		dp = new Details_Page(driver);
	
	}
	return dp;
	
	}
	
	private Logout_Page lop;
	
	public Logout_Page getInstanceLogout() {
	
	if(lop ==null) {
		
		lop = new Logout_Page(driver);

	}
	return lop;
	
	}
	
}