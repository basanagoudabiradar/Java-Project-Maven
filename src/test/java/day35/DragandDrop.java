package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drag=driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions dd=new Actions(driver);
		dd.dragAndDrop(drag, drop).build().perform();

	}

}
