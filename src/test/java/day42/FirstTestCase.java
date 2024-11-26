package day42;

import org.testng.annotations.Test;

public class FirstTestCase {
	@Test(priority=1)
	void openapp()
	{
		System.out.println("open app successfully...");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("login success...");
	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("log out success...");
	}

}
