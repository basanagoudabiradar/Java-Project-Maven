package day27;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitCommands {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        Set<String>windowlist=driver.getWindowHandles();
        //scenario1
        List<String>str=new ArrayList();
        String parentID=str.get(0);
        String childID=str.get(1);
        
        driver.switchTo().equals(childID);
        System.out.println(driver.getTitle());
        
        driver.switchTo().equals(parentID);
        System.out.println(driver.getTitle());
      
	}

}
