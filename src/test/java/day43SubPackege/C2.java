package day43SubPackege;

import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

public class C2 
{
	@Test
	  void xyz()
	  {
		  System.out.println("the xyz from C1");
	  }
	  @AfterTest
	  void at()
	  {
		  System.out.println("after test method is");
	  }

}
