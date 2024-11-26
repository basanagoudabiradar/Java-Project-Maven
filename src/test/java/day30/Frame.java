package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		
		driver.switchTo().defaultContent();
		
		//frame2
		
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");
		driver.switchTo().defaultContent();
		
		//frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("java");
		driver.switchTo().defaultContent();
		//frame4
				WebElement frame4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
				driver.switchTo().frame(frame4);
				driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("AutomationTesting");
				driver.switchTo().defaultContent();
		//inner frame3
		
		driver.switchTo().frame(0);
		
		
		

	}

}
