package pracice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement ringthclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions rgtclk=new Actions(driver);
        rgtclk.contextClick(ringthclick).build().perform();
	}

}