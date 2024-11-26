package pracice;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShot {

	public static void main(String[] args) {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demo.nopcommerce.com/");
			driver.manage().window().maximize();
			/*
			TakesScreenshot st=(TakesScreenshot)driver;
			File sourcefile=st.getScreenshotAs(OutputType.FILE);
			File targetfile=new File(System.getProperty("user.dir")+"//screenshot//fullpag.png");
			sourcefile.renameTo(targetfile);
			*/
			
			//take screen shot of a logo
			
			TakesScreenshot st=(TakesScreenshot) driver;
			WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
			File sourcefile=logo.getScreenshotAs(OutputType.FILE);
			File targetflie=new File (System.getProperty("user.dir")+"//screenshot//logo1.png");
			sourcefile.renameTo(targetflie);
			
	}

}
