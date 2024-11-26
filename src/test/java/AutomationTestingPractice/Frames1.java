package AutomationTestingPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//frame1
		WebElement frm1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frm1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("java");
		driver.switchTo().defaultContent();
		
		//Frame2
		WebElement frm2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frm2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
		driver.switchTo().defaultContent();
		
		
		//frame3
		WebElement frm3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frm3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Automation");
		driver.switchTo().defaultContent();
		
		//frame3
		WebElement frm4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frm4);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Automation");
		driver.switchTo().defaultContent();
				
		driver.switchTo().frame(0);
		
	}

}
