package pracice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableStatic {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        
        //select rows from table
        int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println(+rows);
        
        //select coloumns from table
        int columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println(columns);
        
        //select 3000 price
       int  price=driver.findElements(By.xpath("//table[@name='BookTable']//tr[3]//td[3]")).size();
        System.out.println(+price);
        
        
	}

}
