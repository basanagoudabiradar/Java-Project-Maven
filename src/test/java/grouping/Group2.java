package grouping;

import org.testng.annotations.Test;

public class Group2 
{
	@Test(priority=1,groups= {"Smoke"})
  void SearchBy_id()
  {
	  System.out.println("Smoke test successful by id");
  }
	@Test(priority=1,groups= {"Smoke"})
	  void SearchBy_name()
	  {
		  System.out.println("Smoke test successful by name");
	  }
}
