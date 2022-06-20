package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws IOException {
		
// The Below Indicates from which the document we are getting like loading.
		
		File f = new File(
				"C:\\Users\\Karthik\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\properties\\Adactin.properties");

		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties(); // it was actually Properties p = new Properties(); , p was deaclared after this step.
		
		p.load(fis);
	
	}
// whenever get comes, return should also come.
	public String getUrl() throws IOException {
				
		String url = p.getProperty("url"); 
		
		return url;
		
	}

	public String getUsername() throws IOException {

		String username = p.getProperty("username");
		
		return username;
		
	}
	
	public String getPassword() throws IOException {

		String password = p.getProperty("password");
		
		return password;
		
	}
	
	public String getCheckindate() throws IOException {

		String checkindate = p.getProperty("checkindate");
		
		return checkindate;
	}
	
	public String getCheckoutdate() throws IOException {

		String checkoutdate = p.getProperty("checkoutdate");
		
		return checkoutdate;
	}
	
	public String getFirstname() throws IOException {

		String firstname = p.getProperty("firstname");
		
		return firstname;
	}
	
	public String getLastname() throws IOException {

		String lastname = p.getProperty("lastname");
		
		return lastname;
	}
	
	public String getAddress() throws IOException {

		String address = p.getProperty("address");
		
		return address;
	}
	
	public String getCcnum() throws IOException {

		String ccnum = p.getProperty("ccnum");
		
		return ccnum;
	}
	
	public String getCccvv() throws IOException {

		String cccvv = p.getProperty("cccvv");
		
		return cccvv;
	}
	
	public String getScreenshotMethod() throws IOException {

		String screenshotMethod = p.getProperty("screenshotMethod");
		
		return screenshotMethod;
	}
	

}
