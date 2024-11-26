package day22;

import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AutomationDemo {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.opencart.com/");
		String act_title=driver.getTitle();
		if(act_title.equals("Your Store"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		driver.close();
	}

}
