package day23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com/");
		//boolean logoDisplayStatus=driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		//System.out.println(logoDisplayStatus);
		//List<WebElement>link=driver.findElements(By.tagName("a"));
		//System.out.println("total num of links:"+link.size());
		driver.findElement(By.name("Search")).sendKeys("mobile");
	}

}
