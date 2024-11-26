package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Actions slide=new Actions(driver);
       WebElement min_slide=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
       System.out.println("Default slider is:"+min_slide.getLocation());
       
       slide.dragAndDropBy(min_slide, 80, 0).perform();
       System.out.println("After incresing the slider is in"+min_slide.getLocation());
       
	}

}
