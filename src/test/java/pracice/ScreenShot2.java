package pracice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		TakesScreenshot st=(TakesScreenshot) driver;
		File SourceFile =st.getScreenshotAs(OutputType.FILE);
		File targetfile= new File(System.getProperty("user.dir")+"\\screenshot\\myfile.png");
		SourceFile.renameTo(targetfile);
		
	
	}

}
