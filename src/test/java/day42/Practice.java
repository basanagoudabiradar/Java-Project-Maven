package day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice 
{
	WebDriver driver;
  @Test(priority=1)
  void url()
  {
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
  }
  
  @Test(priority=2)
  void logo()
  {
	  Boolean logo=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	  System.out.println("logo status:"+logo);
  }
  
  @Test(priority=3)
  void login()
  {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  @Test(priority=4)
  void close()
  {
	  driver.close();
  }
  
  
  
  
  
  
  
}
