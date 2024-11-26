package day47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testpage 
{ 
	WebDriver driver;
	
	@BeforeClass
   void setup()
   {
	    driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().window().maximize();
   }
	@Test
	void Pagr_test() 
	{
		PageLogin lp=new PageLogin(driver);
		lp.set_username("Admin");
		lp.set_pwd("admin123");
		lp.login();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
}
