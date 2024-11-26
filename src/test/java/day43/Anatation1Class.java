package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Anatation1Class {
    @BeforeMethod
	void login()
	{
		System.out.println("the login is");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println(" the search is");
	}
	@Test(priority=2)
	void advancedSearch()
	{
		System.out.println("the advanced search ");
	}
	@AfterMethod
	void logout() 
	{
		System.out.println("the logout is");
	}
}
