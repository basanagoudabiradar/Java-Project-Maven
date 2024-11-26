package pracice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SslHandling {

	public static void main(String[] args) {
		ChromeOptions options =new ChromeOptions();
		 options.setAcceptInsecureCerts(true);
        ChromeDriver driver=new ChromeDriver(options);
       
        driver.get("https://expired.badssl.com/");
        System.out.println("print title:"+driver.getTitle());
	}

}
