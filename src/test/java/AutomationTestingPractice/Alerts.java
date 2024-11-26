package AutomationTestingPractice;

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
		//normal alert
	/*	driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
		driver.switchTo().alert().accept();
		*/
		
		/*
		//confirmBox
		driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		*/
		
		//prompt alert
		driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
		Thread.sleep(3000);
		Alert myalert=driver.switchTo().alert();
		
		myalert.sendKeys("hello");
		myalert.accept();
		
	}
}
