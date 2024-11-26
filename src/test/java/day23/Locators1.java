package day23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.demoblaze.com/index.html");
		
	//	List<WebElement>img=driver.findElements(By.tagName("img"));
	//	System.out.println("total num of imges:"+img.size());
		
      //  driver.findElement(By.linkText("phone")).click();
		// driver.findElement(By.partialLinkText("Lapt")).click();
		
	//List <WebElement>footerLinks=driver.findElements(By.className("list-group-item"));
	//System.out.println("total num of footer list:"+footerLinks.size());	
	
  List<WebElement> Links= driver.findElements(By.tagName("a"));
  System.out.println("total num of tag elements:"+Links.size());
	}

}
