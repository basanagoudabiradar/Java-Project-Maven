package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Anatation2Class 
{
	@BeforeClass
	void login()
	{
		System.out.println("the login is");
	}
	@Test
	void search()
	{
		System.out.println("the search is");
	}
	@Test
	void AdvSearch()
	{
		System.out.println("the adv search is");
	}
	@AfterClass
	void logout()
	{
		System.out.println("the logout is");
	}
}
