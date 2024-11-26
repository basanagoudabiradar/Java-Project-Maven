package pracice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
	    driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Automation Testing");
	    driver.switchTo().defaultContent();
	    
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium with java");
        driver.switchTo().defaultContent();
        
        WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("QA-Tester");
        driver.switchTo().defaultContent();
	}

}
