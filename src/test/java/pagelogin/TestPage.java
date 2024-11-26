package pagelogin;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPage
{
  WebDriver driver;
  @BeforeClass
  public void setup()
  {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
  }
  @Test
  void Test_page() 
  {
	  LoginPage lp=new LoginPage(driver);
	  lp.Set_username("Admin");
	  lp.Set_password("admin123");
	  lp.Login();
	  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
  }
  @AfterClass
  void teardown()
  {
	  driver.close();
  }
}
