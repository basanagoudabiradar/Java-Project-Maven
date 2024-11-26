package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        
        //Swich to frame
        driver.switchTo().frame(0);
        //method1 using send keys
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");
        
        //method2 date picker
        
        String year="2025";
        String mounth="July";
        String date="20";
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        //select mounth and year
        
        while(true)
        {
        	
             String currentmounth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); 
             String currentyear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
             
        if(currentmounth.equals(mounth) && currentyear.equals(year))
        {
        	break;
        }
            
        
        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
       // driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
        }
         //select day from date picker
        
      List <WebElement> dates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
      
      for(WebElement dt:dates) 
      {
    	 if(dt.getText().equals(date))
    	  {
    		  dt.click();
    		  break;
    	  }
    	  
      }
    	  

        
	}
	
}

        
	



