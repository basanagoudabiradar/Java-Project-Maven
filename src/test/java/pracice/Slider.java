package pracice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement slide1=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		Actions slide=new Actions(driver);
		System.out.println("before slide"+slide1.getLocation());
		
		slide.dragAndDropBy(slide1, 80, 0).perform();
		System.out.println("after slide"+slide1.getLocation());
		
	}

}
