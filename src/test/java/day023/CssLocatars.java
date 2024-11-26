package day023;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatars {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=flipkart");
       // driver.findElement(By.cssSelector("div#nav-search-dropdown-card")).sendKeys("books");
       // driver.findElement(By.cssSelector("div#nav-search-dropdown-card"));
		//driver.findElement(By.cssSelector("input.nav-input")).sendKeys("books");
		//driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("mobiles");
		//driver.findElement(By.cssSelector("input[name=\"field-keywords\"]")).sendKeys("mobiles");
		driver.findElement(By.cssSelector("input.nav-input[aria-label=\"Search Amazon.in\"]")).sendKeys("books and pens");
		
	}

}
