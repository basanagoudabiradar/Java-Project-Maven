package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.opencart.com/");
		
		//xpath single attribute
		
		//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Shirt");
		
		//xpath with multiple attribute
		
	boolean isDisplay=	driver.findElement(By.xpath("//*text='iphone'")).isDisplayed();
	System.out.println(isDisplay);
		

	}

}
