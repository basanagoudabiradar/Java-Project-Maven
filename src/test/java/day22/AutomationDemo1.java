package day22;

import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemo1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://Demo.nopcommerce.com/");
		String act_title=driver.getTitle();
		if(act_title.equals("nopCommerce demo store"))
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("test case failed");
		}
				
        driver.close();
	}

}
