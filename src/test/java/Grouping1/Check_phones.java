package Grouping1;

import org.testng.annotations.Test;

public class Check_phones 
{
	@Test(priority=1,groups="smoke")
   void check_by_colour()
   {
	   System.out.println("phone is selected by color");
   }
	@Test(priority=2,groups="sanity")
	void check_by_price()
	{
		System.out.println("phone is selected by price");
	}
	@Test(priority=3,groups="regression")
	void check_by_brand()
	{
		System.out.println("phone is selected by price");
	}
	
}
