package pracice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditinalMethod {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		WebElement logoStatus=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
         System.out.println(logoStatus.isDisplayed());
         
       WebElement   Malestatus=driver.findElement(By.xpath("//input[@id='gender-male']"));
       Malestatus.click();
       System.out.println(Malestatus.isSelected());
       
       
       WebElement  femaleStatus=driver.findElement(By.xpath("//label[@for='gender-female']"));
       femaleStatus.click();
       System.out.println(femaleStatus.isSelected());
       
	}

}
