package pagelogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
  //Constructor
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	By uesrname=By.xpath("//input[@placeholder='Username']");
	By password=By.xpath("//input[@placeholder='Password']");
	By login=By.xpath("//button[@type='submit']");
	
	//Actions
	 void Set_username(String name)
	{
		driver.findElement(uesrname).sendKeys(name);
	}
	void Set_password(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
     void Login()
	{
		driver.findElement(login).click();
	}
}
