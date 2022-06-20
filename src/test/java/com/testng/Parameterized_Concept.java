package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {
	
// Here we use @parameters and @optional
// @ parameters is used in test levels to declare the parameters
// @ Optional is used in argument level, it the particular parameter fails means, it will retrieve the data which is presnet in @optional.
// .XML file output is first Priority.
// .Java file output is second Priority.
// Refer Notes for Additional Information.
	
// here Hema and Soni, used because to identify which part is executed, but usually we need to give whatever in .xml file parameters which is same as in @optional.
// here we used @optional in username, so if we give wrong name(case sensitive) in .xml file, it will print "Soni".
// We need to change "parameter name="username"" in parameteized.xml into "Username(U caps).
	
	@Test
	@Parameters({"username", "password"})
	public void credentials(@Optional("Soni")String username, String password) {

		System.out.println("User Name is :" + username);
		
		System.out.println("Password is :" + password);
		
	}

}
