package Day44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency 
{
	@Test(priority=1)
    void Test_openapp()
    {
    	Assert.assertTrue(true);
    }
	
    @Test(priority=2, dependsOnMethods={"Test_openapp"})
    void login()
    {
    	Assert.assertTrue(true);
    }
    
    @Test(priority=3, dependsOnMethods= {"login"})
    void search() 
    {
    	Assert.assertTrue(false);
    }
    
    @Test(priority=3, dependsOnMethods= {"search"})
    void logout()
    {
    	Assert.assertTrue(true);
    }
}
