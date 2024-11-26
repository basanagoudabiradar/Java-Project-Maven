package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.opencart.com/");
		
		//xpath with single attribute
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T-shirts");
		
		//xpath with multiple attribute
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-shirts");
		
		//xpath with and operator 
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("T-shirts");
		
		//xpath with or operator
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("T-shirts");
		
		//xpath with text method
		/*driver.findElement(By.xpath("//*[text()='macbook']")).click();
	      boolean isDisplayed=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
	      System.out.println(isDisplayed);
          String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
          */
		//xpath with contains
		//  driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("tshirt");
		  
		  //xpath with starts-with
		  
		 // driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("tshirt");
		  
		  //Chained Xpath
		
		//boolean status=  driver.findElement(By.xpath("//[@div='logo']/a/img")).isDisplayed();
		//System.out.println(status);
		
		
		
		
		

	
	}

}
