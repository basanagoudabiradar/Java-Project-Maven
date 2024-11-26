package Day44;

import org.testng.annotations.Test;

public class SingUpTestByGrouping 
{
	@Test(priority=1,groups= {"regression"})
	   void singupByemail()
	   {
			System.out.println("singup by email");
	   }
		
		@Test(priority=2,groups= {"regression"})
		   void singupByfacebook()
		   {
				System.out.println("singup by facebok");
		   }
		
		@Test(priority=3,groups= {"regression"})
		   void singupBytwiter()
		   {
				System.out.println("singup by twiter");
		   }
	
}
