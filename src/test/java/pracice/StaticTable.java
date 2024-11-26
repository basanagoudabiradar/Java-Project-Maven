package pracice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//getting rows form table
		
		int  rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("num of rows"+rows);
         //getting num of column 
       int  coloumns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("num of columns"+coloumns);
          
        //getting tr[2]th[3]
        
        String  bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
        
        System.out.println(bookname);
        
        
        String  bookprice=driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[3]")).getText();
 
        System.out.println(bookprice);
        
        String  book=driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[3]")).getText();
        
        System.out.println(book);
        
        
        
	}

}
