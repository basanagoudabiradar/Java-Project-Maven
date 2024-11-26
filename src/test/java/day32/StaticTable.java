package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//number of rows in a web 
        //aproch1
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(+rows);
		
		//aproch2----->by tag name
	 /*   int rows=driver.findElements(By.tagName("tr")).size();
	    System.out.println("num of rows:"+rows);
	    */
	    
		//num of columns in a table
	    
	    int   columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	    System.out.println("num fo columns are:"+columns);
	    
		
		//read data from specific row and column(ex 5th row 1st column)
		
	/*	String bookname= driver.findElement(By.xpath(" //table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(bookname);
		
		//read data from specific row and column(ex 4th row 2st column)
	/*	String bookname= driver.findElement(By.xpath(" //table[@name='BookTable']//tr[4]//td[2]")).getText();
		System.out.println(bookname);
		*/
		//read data from all rows and columns
	/*	System.out.println("Bookname"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=columns;c++ )
			{
				String value= driver.findElement(By.xpath(" //table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
		*/	/*
			for(int r=2;r<=rows;r++)
			{
			String Authorname=	driver.findElement(By.xpath(" //table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			System.out.println(Authorname);
			if(Authorname.equals("Mukesh"))
			{
				String Bookname=driver.findElement(By.xpath(" //table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(Bookname+"\t"+Authorname);
			}
			
		    }
		    */
	    //find total price of all books
	/*    int total=0;
	    for(int r=3;r<=rows;r++)
		{
		String price=	driver.findElement(By.xpath(" //table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		total=total+Integer.parseInt(price);
		}
	    System.out.println("total"+total);
	    
	    */
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
	}

}
