package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion 
{ 
  @Test
  void testTite()
  {
	  String act_title="opencart";
	  String exp_title="opencart";
	  Assert.assertEquals(act_title, exp_title);
  }
}
