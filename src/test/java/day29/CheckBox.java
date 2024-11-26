package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Select Specific Check Box
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//Select all Check Boxes
	List<WebElement> CheckBox=	driver.findElements(By.xpath("//input[@class='form-check-input' ]"));
	
	//using for loop
	/*	for(int i=0;i<CheckBox.size();i++)
		{
			CheckBox.get(i).click();
		}
		*/
	    
	//using enhanced for loop
	     for(WebElement checkbox:CheckBox)
	     {
	    	checkbox.click();
	     }
	
	
	//select first 3 check boxes
	
/*	for(int i=0;i<3;i++)
	{
		CheckBox.get(i).click();
		
	}
	*/
	
    //select last 3 check boxes
		/*
		for(int i=4;i<CheckBox.size();i++) 
		{
			CheckBox.get(i).click();
		}
	*/	
		//unclick check boxes
	/*
		for(int i=0;i<3;i++)
		{
			CheckBox.get(i).click();
			
		}
		Thread.sleep(5000);
		for(int i=0;i<CheckBox.size();i++) 
		{
			CheckBox.get(i).click();
		}
		*/
	}
	
	
	
	
	
	
	
	
	
	
	}


