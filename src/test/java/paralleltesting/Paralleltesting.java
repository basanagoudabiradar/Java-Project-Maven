package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paralleltesting 
{
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
   void setup(String br)
   {
	   switch (br.toLowerCase())
	   {
		   case "chrome":driver=new ChromeDriver(); break;
		   case "edge":driver=new EdgeDriver(); break;
		   default :System.out.println("in valid browser");
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   driver.manage().window().maximize();
	   }
	  
   }
	@Test
	void title()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@Test
	void logo()
	{
		driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	}
	@AfterClass
	void teardown()
	{
		driver.close();
	}
	
	
	
	

}
