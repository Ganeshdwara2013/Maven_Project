package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	
/*There are three methods
 * @Ignore
 * @Test (enabled = fals)
 * <exclude name = "methodname"> in .xml file </exclude>
 * */

// Here Mutton and Mushroom are excluded.
// Chicken was excluded in ignore.xml.
// Refer Notes for Additional Reference.
	
	
	@Test
	public void chicken() {

		System.out.println("Chicken");
	}
	
	@Ignore
	@Test
	public void mutton() {

		System.out.println("Mutton");
	}
	
	@Test(enabled = false)
	public void mushroom() {

		System.out.println("Mushroom");
	}
	
	@Test 
	public void paneer() {

		System.out.println("Paneer");
	}
	
	@Test
	public void fish() {

		System.out.println("Fish");
	}

}
