package pracice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
		field1.clear();
		field1.sendKeys("basangouda");
	    driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement click=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions action=new Actions(driver);
		action.doubleClick(click).build().perform();
		
	}

}
