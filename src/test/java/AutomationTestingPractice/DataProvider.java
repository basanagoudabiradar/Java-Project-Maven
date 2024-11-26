package AutomationTestingPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProvider 
{
	WebDriver driver;
	@BeforeClass
   void setup()
   {
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.manage().window().maximize();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   }
	@Test(dataProvider="dp")
	void login(String email,String pwd)
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@AfterClass
	void closebrowser() 
	{
		driver.close();
	}
	
	@org.testng.annotations.DataProvider(name="dp",indices= {0,1})
	Object[][] loginData()
	{
		Object logindata[][]= {
				{"Admin","admin23"},
				{"Admin","admin123"},
				{"name","admin123"},
				{"Ad","admin1234"},		
		
	                     };
		return logindata;
	
	
	}
	
	
	
	
	
}
