package day023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSlocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        
        //tag Id
      //  driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
        
        //tag class
      // driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");

        //tag attributes
        
       // driver.findElement(By.cssSelector("input[name='q']")).sendKeys("T-Shirts");
        
        //tag class attributes
        
        driver.findElement(By.cssSelector("input.search-box-text[placeholder=\"Search store\"]")).sendKeys("T-shirts");
        
	}

}
