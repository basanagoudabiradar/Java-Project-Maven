package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		;
		
		WebElement button1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement button2=driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement box=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        
       
        
        button1.clear();
        button1.sendKeys("Welcome");
        
        Actions dk=new Actions(driver);
        
        dk.doubleClick(box).perform();
        
        //check weather the button2 as value of button1
        String text=button2.getAttribute("value");
        if(text.equals("Welcome"))
        {
        	System.out.println("text coped...");
        }
        else 
        {
        	System.out.println("text not copied..");
        }
		
	   
      
	}

}
