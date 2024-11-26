package AutomationTestingPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement slide1=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		//WebElement slide2=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default ']"));
		Actions slide=new Actions(driver); 
		slide.dragAndDropBy(slide1, 80, 0).perform();
		System.out.println(slide1.getLocation());

	}

}
