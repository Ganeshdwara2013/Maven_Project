package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButton_Page {

	public RadioButton_Page(WebDriver driver2) {

		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver driver; // null

	@FindBy(name ="radiobutton_0")
	private WebElement radiobutton;

	@FindBy(name ="continue")
	private WebElement conti;
	
	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getConti() {
		return conti;
	}

	
}
