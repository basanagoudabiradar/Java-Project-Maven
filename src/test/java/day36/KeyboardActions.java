package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='CodeMirror-merge-pane CodeMirror-merge-editor']")).sendKeys("welCometoMyTeam");
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

	}

}
