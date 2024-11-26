package grouping;

import org.testng.annotations.Test;

public class Group3 
{
	@Test(priority=1, groups="smoke")
  void cartcheckbyname()
  {
	  System.out.println("carts check successful by name");
  }
	@Test(priority=2, groups="sanity")
	  void cartcheckbyid()
	  {
		  System.out.println("carts check successful by id");
	  }
}
