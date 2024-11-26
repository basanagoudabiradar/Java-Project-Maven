package AutomationTestingPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Select Country
	/*	WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
		Select st=new Select(country);
		st.selectByIndex(8);
		*/
	/*	
		//Select color
		WebElement color=driver.findElement(By.xpath("//Select[@class='form-control' and@id='colors']"));
		Select stt=new Select(color);
		stt.selectByIndex(1);
	*/	
	    //select job
		WebElement job=driver.findElement(By.xpath("//Select[@id='RESULT_RadioButton-3' and@class='drop_down']"));
		Select jobs=new Select(job);
		jobs.selectByIndex(1);
		

	}

}
