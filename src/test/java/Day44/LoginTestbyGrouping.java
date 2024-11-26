package Day44;

import org.testng.annotations.Test;

public class LoginTestbyGrouping 
{
	@Test(priority=1,groups= {"sanity"})
	void loginbyemail()
	{
		System.out.println("this is login by email");
	}
	@Test(priority=2,groups= {"sanity"})
	void loginbyfacebook()
	{
		System.out.println("this is login by facebook");
	}
	@Test(priority=3,groups= {"sanity"})
	void loginbytwiter()
	{
		System.out.println("this is login by twiter");
	}

}
