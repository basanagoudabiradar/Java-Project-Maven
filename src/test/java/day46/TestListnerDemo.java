package day46;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Mylistenr.class)
public class TestListnerDemo 
{
	WebDriver driver;
    @BeforeClass
    void setup()
    {
    driver=new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
    }
     @Test
	void logo() throws InterruptedException
	{
		Thread.sleep(2000);
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	@Test
	void testurl()
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(dependsOnMethods="testurl")
	void test_title() 
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM" );
	}
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
	
	
}
