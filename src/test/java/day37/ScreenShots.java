package day37;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();

	//take screen shot of the page
	
	TakesScreenshot st= (TakesScreenshot) driver;
	 File sourcefile =st.getScreenshotAs(OutputType.FILE);
	 File targetfile=new File(System.getProperty("user.dir")+"\\screenshot\\fullpage.png");
	 sourcefile.renameTo(targetfile);
	 
	
/*	 // take a screen short of  specific part of a page 
	WebElement fproduct= driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
	File srcfile=fproduct.getScreenshotAs(OutputType.FILE);
	File trgfile=new File(System.getProperty("user.dir")+"\\screenshot\\specipicpage.png");
	srcfile.renameTo(trgfile);
	*/
/*	
	//take screen shot 0f logo
	WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	File sfile=logo.getScreenshotAs(OutputType.FILE);
	File tfile= new File(System.getProperty("user.dir")+"\\screenshot\\logo.png");
	sfile.renameTo(tfile);
*/	
	
	}

}