package AutomationTestingPractice;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asseration 
{  
	@Test
   void name()
   {
	   String actual="selemium";
	   String expected="selemium";
	   Assert.assertEquals(actual, expected);
   }
}
