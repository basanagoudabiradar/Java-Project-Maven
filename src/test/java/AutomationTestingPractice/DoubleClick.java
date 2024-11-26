package AutomationTestingPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.reactivex.rxjava3.functions.Action;

public class DoubleClick {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
		field1.clear();
		field1.sendKeys("biradar");
		driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement click=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		Actions action=new Actions(driver);
		action.doubleClick(click).build().perform();
		

	}

}
