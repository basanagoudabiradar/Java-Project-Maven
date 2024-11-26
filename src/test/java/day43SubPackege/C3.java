package day43SubPackege;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 
{
    @Test
	void pqr()
	{
		System.out.println("this is pqr form c3");
	}
    @BeforeSuite
    void Beforesuite()
    {
    	System.out.println("before suite");
    }
    @AfterSuite
    void Aftersuite()
    {
    	System.out.println("After suite");
    }
}
