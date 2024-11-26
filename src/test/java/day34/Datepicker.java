package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/20/2024");
        
        //by date picker month and year
        
        String year="2026";
        String month="May";
        String date="5";
        driver.findElement(By.xpath("//input[@id='datepicker']"));
        while(true)
        {
               String  currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
               String currentmonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
                 if(currentyear.equals(year) && currentmonth.equals(month) )
                      {
    	                   break;
                      }
                           driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }
        
        // date by date picker
         driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
         List <WebElement> dates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
        for(WebElement dt:dates)
        	if(dt.getText().equals(date))
        	{
        		dt.click();
        		break;
        	}
	}

}
