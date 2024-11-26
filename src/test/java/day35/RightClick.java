package day35;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("http://swisnl.github.io/jQuery-contextMenu/demo.html"));
		
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		//right click
		
		Actions btn=new Actions(driver);
		btn.contextClick(button).build().perform();
	}

}
