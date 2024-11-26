package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLogin 
{
    WebDriver driver;
    //Constructor
    
    PageLogin(WebDriver driver)
   {
	   this.driver=driver;
   }
   
   //Locators  

 By txt_user_name=By.xpath("//input[@placeholder='Username']");
 By txt_pwd=By.xpath("//input[@placeholder='Password']");
 By login=By.xpath("//button[normalize-space()='Login']");

 //Actions
 
 void set_username(String user)
 {
	 driver.findElement(txt_user_name).sendKeys(user);
 }

 void set_pwd(String pwd)
 {
	 driver.findElement(txt_pwd).sendKeys(pwd);
 }
 
 void login()
 {
	 driver.findElement(login).click();
 }
   
}
