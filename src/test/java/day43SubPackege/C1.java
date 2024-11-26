package day43SubPackege;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 
{
	@Test
  void abc()
  {
	  System.out.println("the abc from C1");
  }
  @BeforeTest
  void bt()
  {
	  System.out.println("before test method is");
  }
}
