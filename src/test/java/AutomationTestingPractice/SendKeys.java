package AutomationTestingPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//enter name
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Basanagouda");
		
		//enter email
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Basanagouda1992.krg@gamil.com");
		
		//enter phone number
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8105999262");
		
		//enter address
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Karaganur tq:talikoti Dist:vijayapur");
		
		
		
		
		

	}

}
