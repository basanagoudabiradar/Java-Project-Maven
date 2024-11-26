package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
public class SelectDropdown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropCountryname=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select dropCountry= new Select (dropCountryname);
		//dropCountry.selectByVisibleText("Canada");
		 // dropCountry.selectByValue("germany");
		//dropCountry.selectByIndex(9);
		
		//Capture the options from dropdown
		
		List<WebElement> options=dropCountry.getOptions();
		System.out.println("num of options in a dropdown is:"+options.size());
		
		//printing the option
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		

	}

}
