package pracice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
	/*	//Normal Alert
		driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	*/	
		//Confirm Alert
	/*	WebElement confirm=driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']"));
		Thread.sleep(3000);
		driver.switchTo().alert().getText();
		System.out.println(confirm.getText());
		*/
		//SendKey Alerts
		driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
		Thread.sleep(3000);
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("ok");
		myalert.accept();
	}

}
