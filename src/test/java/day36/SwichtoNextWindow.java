package day36;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwichtoNextWindow {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://Demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		WebElement reg_link=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		Actions action=new Actions(driver);
		
		action.keyDown(Keys.CONTROL).click(reg_link).keyUp(Keys.CONTROL).perform();
		
		//Swich 
			
		List <String> ids=new ArrayList(driver.getWindowHandles());
		
		//Swich to register window
		
		driver.switchTo().window(ids.get(1));
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("john");
		
		
		//swich  to home page
		
		driver.switchTo().window(ids.get(0));
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("pants");
		
	}

}
