package AutomationTestingPractice;

import org.testng.annotations.Test;

public class Grouping 
{
	@Test(priority=1,groups="sanity")
   void login_email()
   {
	   System.out.println("login by email");
   }
	@Test(priority=2,groups="regression")
	   void login_x()
	   {
		   System.out.println("login by x");
	   }
	@Test(priority=3,groups="regression")
	   void login_facebook()
	   {
		   System.out.println("login by facebook");
	   }
}
