package day22;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");   
	        String   cut_url= driver.getCurrentUrl();
	        
	        if(cut_url.equals("https://demo.opencart.com/"))
				{
			        System.out.println("Test Passed");
				}
		else
		{
			System.out.println("test failed");
		}
       driver.close();
	}

}
