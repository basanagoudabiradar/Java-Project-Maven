package pracice;

import java.awt.Checkbox;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox 
{

	public static void main(String[] args) 
	{
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
      List <WebElement> days= driver.findElements(By.xpath("//input[@class='form-check-input' and@type='checkbox']"));
     /*   for(WebElement Checkbox:days)
        
        {
        	Checkbox.click();
        }
        
       */ 
      
      //for first 3 days
       for(int i=0;i<3;i++) 
       {
    	  days.get(i).click();
       }
    	   
    /*	//Select Country
        WebElement countries= driver.findElement(By.xpath("//select[@id='country']"));
        Select select= new Select(countries);
        select.selectByIndex(2);
      */  
        //selct Color
       WebElement  Colour=driver.findElement(By.id("colors"));
       Select set=new Select(Colour);
       set.selectByIndex(3) ;
        
        
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("25/07/2025");
        
        
        
        
        
        
        
        
    
        
        
        
        
        
        
        
        
	}

	
}


