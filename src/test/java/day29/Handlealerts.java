package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlealerts {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		
		//normal alert with ok button
		
		driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
       //confirmation alert ok cancle
		
		driver.findElement(By.xpath("//input[@id='confirmexample']")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
		
		
		//prompt alert
		
		driver.findElement(By.xpath("//input[@id='promptexample']")).click();
		Thread.sleep(3000);
	    Alert myalert=	driver.switchTo().alert();
		myalert.sendKeys("welcome");
		myalert.accept();
		
	}

}
