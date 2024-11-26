package pracice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropedown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));
		Select sl=new Select(dropdown);
		sl.selectByIndex(5);
		
	}

}
