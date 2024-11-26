package grouping;

import org.testng.annotations.Test;

public class Group1 
{
	@Test(priority=1,groups="sanity")
  void login_smalllatter()
  {
	  System.out.println("login by small latter");
  }
	@Test(priority=2,groups="sanity")
	  void login_Capitallatter()
	  {
		  System.out.println("login by capital latter");
	  }
}
