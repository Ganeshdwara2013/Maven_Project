package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Concept {
	
// To run same set of actions on mutiple set of Test Data.
// Retrun Type is  2-D Array Object
// Data Provider returns a two-dimensional Java Object to the test method
// Annotations user here is "DataProvider".
	
   @Test(dataProvider = "input") // below method name
   public void credentials(String username, String password) {

	   System.out.println("UserName is : "+ username);
	   
	   System.out.println("Password is : "+ password);
	   
   }
   
  //  We will create a new method and giving method as dataprovider = method name
  //  we will save the input data into the new method created
   
   @DataProvider // dataprovider annotation user here
   public Object[][] input() {

	  return new Object [][] {
		  
		  {"Shalini", "123"}, // since the data given in string, we are giving double quotes here.
		  {"Aara", "456"},
		  {"Kasthuri","789"}
	  };
   }

}
