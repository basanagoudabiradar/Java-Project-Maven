package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertion 
{
	//@Test
    void Test_HardAssert()
    {
    	System.out.println("testing...");
    	System.out.println("testing...");
    	
    	//Assert.assertEquals(2,2);      //pass
    	//Assert.assertEquals("testing...", "testing..."); //pass
    	
    	Assert.assertNotEquals(5, 5);//false
    	
    	System.out.println("testing...");
    	System.out.println("testing...");
    }
	@Test
	void Test_softassertion()
	{
		System.out.println("soft_assert");
		System.out.println("soft_assert");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("soft_assert", "soft_assert"); //true
		//sa.assertEquals("soft_assert", "soft");  //false
		System.out.println("soft_assert");
		System.out.println("soft_assert");
		sa.assertAll();
	}
}
