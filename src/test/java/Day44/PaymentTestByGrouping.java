package Day44;

import org.testng.annotations.Test;

public class PaymentTestByGrouping 
{
	@Test(priority=1,groups= {"sanity","regresssion","functinal"})
   void paymentByrupee()
   {
	  System.out.println("payment by rupee"); 
   }
	

	@Test(priority=2,groups= {"sanity","regresssion","functinal"})
   void paymentByDoller()
   {
	  System.out.println("payment by Doller"); 
   }
}
