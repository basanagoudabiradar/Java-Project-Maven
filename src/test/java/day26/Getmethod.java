package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//get url
        driver.get("http://demo.opencart.com/");
        Thread.sleep(5000);
        
        //get title
        //System.out.println(driver.getTitle());
        //get current url
       //System.out.println(driver.getCurrentUrl());
       //get pageSource
       //System.out.println(driver.getPageSource());
       //get Window Handle
       //String windowid=(driver.getWindowHandle());
       //System.out.println(windowid);
		driver.findElement(By.linkText("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24"));
		Set <String> windowids=driver.getWindowHandles();
		System.out.println(windowids);
		
	}

}
