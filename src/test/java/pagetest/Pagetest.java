package pagetest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Pagetest 
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
	void pagetest()
	{
		Pagelogin pl=new Pagelogin(driver);
		pl.set_username("Admin");
		pl.set_userpwd("admin123");
		pl.set_login();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
	
}
