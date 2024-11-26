package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	        driver.get("http://demo.opencart.com/");
	        driver.manage().window().maximize();
	        
	       WebElement desktop= driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	       WebElement Mac= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	       
	       Actions action=new Actions(driver);
	       //mouse hover
	       action.moveToElement(desktop).moveToElement(Mac).click().build().perform();
	       
	       

	}

}
