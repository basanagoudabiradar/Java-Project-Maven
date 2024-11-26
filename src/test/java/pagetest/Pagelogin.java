package pagetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pagelogin 
{
	WebDriver driver;
   //constructor
	Pagelogin(WebDriver driver)
	{
		this.driver=driver;
	}
	//locators
	By usernmae=By.xpath("//input[@placeholder='Username']");
	By userpwd=By.xpath("//input[@placeholder='Password']");
	By click=By.xpath("//button[@type='submit']");
	
	//Actions
	public void set_username(String name)
	{
		driver.findElement(usernmae).sendKeys(name);
	}
	public void set_userpwd(String pwd)
	{
		driver.findElement(userpwd).sendKeys(pwd);
	}
	public void set_login()
	{
		driver.findElement(click).click();
	}
}
