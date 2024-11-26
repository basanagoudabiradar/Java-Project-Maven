package day23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
		WebDriver  driver = new ChromeDriver();
		driver.get("http://demo.opencart.com/");
		driver.manage().window().maximize();
		
        //name locator
		//driver.findElement(By.name("search")).sendKeys("mac");
		
		//id
	//boolean logoDisplayStatus=driver.findElement(By.id("logo")).isDisplayed();
	//System.out.println(logoDisplayStatus);
		
		//link text or partial text
		
		//driver.findElement(By.linkText("Tablets")).click();
	//	driver.findElement(By.partialLinkText("Tablet")).click();
		
		//Class Name
		 
		//List<WebElement> HeaderLinks=driver.findElements(By.className("list-inline-item"));
		//System.out.println("Total num of header liknks are:"+HeaderLinks.size());
		
		//Tag Name
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
	    System.out.println("total num of links:"+links.size());
		
		
		//List <WebElement>images=driver.findElements(By.tagName("img"));
		//System.out.println("total num of images:"+images.size());
		
		
		
		
		
	}

}
