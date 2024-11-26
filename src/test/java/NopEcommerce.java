import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopEcommerce {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register");
		
		//Scenario=1  Logo
		WebElement displayStatus=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(displayStatus.isDisplayed());
		//Scenario =2 Search Box
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Shirts");
		
		//Scenario=3
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).click();
		driver.findElement(By.xpath("//ul[@class='top-menu mobile']//a[normalize-space()='Desktops']")).isDisplayed();	
		
		//Scenario=4
		WebElement Male_btn=driver.findElement(By.xpath("//span[@class='male']"));
		Male_btn.click();
		System.out.println(Male_btn.isSelected());
		
		//Scenario=5
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("basanagouda");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("biradar");
		
		//Scenario=6
		driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("17");
		driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("september");
		driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1992");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("basanagouda1992.krg@gmail.com");
		
		//Scenario=7
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("C R Infotech");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Bassu@1992");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Bassu@1992");
		driver.findElement(By.xpath("//button[@id='register-button']")).click();
		System.out.println("registration is completed");
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
