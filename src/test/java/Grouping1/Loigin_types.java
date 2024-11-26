package Grouping1;

import org.testng.annotations.Test;

public class Loigin_types 
{
	@Test(priority=1,groups="sanity")
  void login_by_num()
  {
	  System.out.println("logged by num");
  }
	@Test(priority=2,groups="smoke")
	  void login_by_email()
	  {
		  System.out.println("logged by email");
	  }
	@Test(priority=3,groups="regression")
	  void login_by_pwd()
	  {
		  System.out.println("logged by pwd");
	  }
}
