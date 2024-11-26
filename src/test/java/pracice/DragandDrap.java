package pracice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrap {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement drag=driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();

	}

}
