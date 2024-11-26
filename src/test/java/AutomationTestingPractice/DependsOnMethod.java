package AutomationTestingPractice;

//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod 
{
	@Test(priority=1)
   void url()
   {
	  Assert.assertTrue(true);
   }
	@Test(priority=2, dependsOnMethods= {"url"})
	void login()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=2, dependsOnMethods= {"login"})
	void search()
	{
		Assert.assertTrue(true);
	}
}
