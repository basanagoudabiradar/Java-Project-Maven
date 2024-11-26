package day28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		 Set<String> Windowlist=driver.getWindowHandles();
		 //aproch1
	/*	 List<String> stg=new ArrayList(Windowlist);
		 
		 String parentID=stg.get(0);
		 String childID=stg.get(1);
		 
		 driver.switchTo().window(childID);
		 System.out.println(driver.getTitle());
		 
		 driver.switchTo().window(parentID);
		 System.out.println(driver.getTitle());
		 */
		 
		 //aproch2
		 
		 for(String title:Windowlist )
		 {
			 driver.switchTo().window(title).getTitle();
			 System.out.println(title);
		 
			if(title.equals("Human resource management software|OrangeHRM"))
			{
				driver.close();
			}
		 }
		 
		 

		
	}

	

	

}
