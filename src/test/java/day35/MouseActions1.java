package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//double click
		 WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2= driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement ck=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		box1.clear();
		box1.sendKeys("WELCOME");
		
		Actions dk=new Actions(driver);
		dk.doubleClick(ck).perform();
		
		String text= box2.getAttribute("value");
		if(dk.equals(text))
		{
			System.out.println(" text action currect");
		}
		else
		{
			System.out.println(" text action in currect");
		}

		

	}

}
