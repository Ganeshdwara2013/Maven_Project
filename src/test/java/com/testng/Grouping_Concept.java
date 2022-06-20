package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Grouping_Concept {

//  Group is a advance concept of Ignore
//  tagnames used in groups are below:-
//  <Groups>, <run>, <include>, <Exclude>, <define>.
//  Groups must be updated in xml file( between Test and Class).
	
/* In Groups Concept,if we give Include it will retrieve only the methods inside groups.
 * Vice Versa, if we give exclude it will exclude the methods only in the group 
 * */
	
/* Groups of Groups is advanced Concept of Groups.
 * Groups of Groups, we need to define and categorize the groups, whereas in groups we categorized the methods
 * After Defining, normal Include and Exclude methods we can use as like we saw in above concepts "Groups.xml" topic.
 * */	
	
	@Test(groups = "Non Veg")
	public void chicken() {

		System.out.println("Chicken");
	}
	
	@Test (groups = "Non Veg")
	public void mutton() {

		System.out.println("Mutton");
	}
	
	@Test (groups = "Veg")
	public void mushroom() {

		System.out.println("Mushroom");
	}
	
	@Test (groups = "Veg")
	public void paneer() {

		System.out.println("Paneer");
	}
	
	@Test(groups = "Non Veg")
	public void fish() {

		System.out.println("Fish");
	}


	@Test (groups = "Vehicle")
	public void cycle() {

		System.out.println("Cycle");
	}
	
	@Test (groups = "Vehicle")
	public void scooter() {

		System.out.println("Scooter");
	}

}