package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSelection_Page {

	public WebDriver driver; //null

	@FindBy(name = "location")
	private WebElement location;
	
	@FindBy(name = "hotels")
	private WebElement hotels;
	
	@FindBy(name = "room_type")
	private WebElement roomtype;
	
	@FindBy(name = "room_nos")
	private WebElement roomnos;
	
	@FindBy(name = "datepick_in")
	private WebElement checkindate;
	
	@FindBy(name = "datepick_out")
	private WebElement checkoutdate;
	
	@FindBy(name = "adult_room")
	private WebElement adultroom;
	
	@FindBy(name = "child_room")
	private WebElement childroom;
	
	@FindBy(name = "Submit")
	private WebElement submit;
	
	public HotelSelection_Page(WebDriver driver2) {

		this.driver =driver2;
		PageFactory.initElements(driver, this);
	
	}
	
	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotels() {
		return hotels;
	}


	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}
	
	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
}