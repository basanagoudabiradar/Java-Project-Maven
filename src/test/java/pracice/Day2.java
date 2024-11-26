package pracice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//select specific check box
	//	driver.findElement(By.xpath("//input[@id='sunday']")).click();
		//select multiple check box
		
		List <WebElement> Checkbox=driver.findElements(By.xpath("//input[@class='from-check-input'and@type='check box']"));
		/*
    	for(WebElement cb:Checkbox)
		{
			cb.click();
		}
		*/
		
		//for first three days
		
		for( int i=0; i<=Checkbox.size();i++)
		{
			Checkbox.get(i).click();
		}
		

	}

}
