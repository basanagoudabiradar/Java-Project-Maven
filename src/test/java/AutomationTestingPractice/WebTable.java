package AutomationTestingPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		 int rows= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		 System.out.println(+rows);
		int price= driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th[2]")).size();
		 System.out.println(+price);

	}

}
