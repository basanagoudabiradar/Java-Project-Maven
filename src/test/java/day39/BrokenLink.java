package day39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrokenLink {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		//Capture all the links from server
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("num of brokenLinks are"+links.size());
		int noOfBrokenLInks=0;
		for( WebElement linkele:links)   //get all links 
		{
		  String   hreffattbt=linkele.getAttribute("href"); //get all href 
		  if(hreffattbt==null|| hreffattbt.isEmpty());
		  {
		  System.out.println(" No broken link of Broken link empty");
		  }
		  try
		  {
		  URL gurl=new URL(hreffattbt);
		  HttpURLConnection conn= (HttpURLConnection) gurl.openConnection();
		  conn.connect();
		  
		  if(conn.getResponseCode()>=400)
		  {
			  System.out.println(hreffattbt +"brokenlinks");
			  noOfBrokenLInks++;
		  }
		  else
		  {
			  System.out.println(hreffattbt+ "not broken links");
		  }
		  }
		  
		  catch(Exception e)
		  {
			  
		  }
		}
		System.out.println("num of broken links"+noOfBrokenLInks);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		    }
	        
	
	}


