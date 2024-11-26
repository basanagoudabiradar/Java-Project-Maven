package day31;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az..com/boots/demo.php?ex=63.0_2");

	}

}
