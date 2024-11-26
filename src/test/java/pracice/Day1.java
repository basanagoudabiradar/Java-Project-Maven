package pracice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	/*	Boolean display=driver.findElement(By.xpath("//h1[@class='title']")).isDisplayed();
		 System.out.println("status is...."+display);
		 
		 driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("testing");
		 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("abc@gmail.com");
		*/
		//CheckBox
	  /*   WebElement	ck_male =driver.findElement(By.xpath("//input[@id='male']"));
	     WebElement ck_female=driver.findElement(By.xpath("//input[@id='female']"));
		  ck_male.click();
		  */
		 //dropDown  
		/*
	     WebElement	dropdown= driver.findElement(By.xpath("//select[@id='country']"));
		  
		 Select dp=new Select(dropdown);
		 dp.selectByIndex(8);//-------->select by index
		   dp.selectByVisibleText("India");
		  */ 
		   //alert
		 driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).isDisplayed();
		 
		
	}

}
