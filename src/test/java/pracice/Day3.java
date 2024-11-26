package pracice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
      //  driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("2/2/2025");
        
        //Static table ----->count num of rows
 /*    int  rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
     System.out.println("num of rows are..."+rows);
     */
        //Static table ------>count num of columns
 /*       
     int  rows = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
     System.out.println("num of columns are..."+rows);
 */
    WebElement datepicker= driver.findElement(By.xpath("//input[@id='datepicker']"));
    
    String year= "2025";
    String mounth="March";
    String date ="2";
       
	}

}
