package pracice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ConditinalMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		
      // ChromeDriver driver=new ChromeDriver();
       ChromeDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://testautomationpractice.blogspot.com/");
	/*   WebElement clsname= driver.findElement(By.className("form-control"));
	  System.out.println("Display Status:"+clsname.isDisplayed());
	  System.out.println("Enable Status:"+clsname.isEnabled());
	  */
       
  /*    
     WebElement male= driver.findElement(By.id("male"));
     WebElement female= driver.findElement(By.id("female"));
    System.out.println( male.isSelected());   //falls
    System.out.println( female.isSelected()); //falls
     male.click();
     System.out.println( male.isSelected());   //true
     System.out.println( female.isSelected()); //falls
      
     driver.navigate().refresh();
    */
       
       // Normal alerts 
       /*
     driver.findElement(By.xpath("//button[normalize-space()='Alert']")).click();
     driver.switchTo().alert().accept();
     driver.findElement(By.id("name")).sendKeys("basanagouda");
     */
       
     //Confirm Alert
       /*
     driver.findElement(By.xpath("//button[normalize-space()='Confirm Box']")).click();
     
     Alert alrt=  driver.switchTo().alert();
     alrt.accept();
     driver.findElement(By.id("name")).sendKeys("basanagouda");
     */
       
     //prompt alert
     driver.findElement(By.xpath("//button[normalize-space()='Prompt']")).click();
     
     Alert myalert=driver.switchTo().alert();
    String msg=myalert.getText();
    System.out.println(msg);
      myalert.sendKeys("prompt");
     Thread.sleep(3000);
     myalert.accept();
     
     
	}

}
