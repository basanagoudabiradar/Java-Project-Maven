package AutomationTestingPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
	/*	
		WebElement Male=driver.findElement(By.xpath("//input[@id='male']"));
		Male.click();
		Male.isSelected();
		System.out.println("male button is selected "+Male);
	*/	
		List <WebElement> select=driver.findElements(By.xpath("//input[@class='form-check-input' and@type='checkbox']"));
	/*	for(WebElement sl:select)
		{
	           sl.click();
		}
		*/
		for(int i=0;i<3;i++)
		{
			select.get(i).click();
		}
	}

}
