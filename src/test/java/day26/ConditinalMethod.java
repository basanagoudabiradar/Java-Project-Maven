package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditinalMethod {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();
 //  WebElement  logo=   driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
 //  System.out.println(logo.isDisplayed());
        
        //is Enable
    // boolean status=  driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
    //  System.out.println(status);
        
        //is selected
  WebElement    male_bt  =driver.findElement(By.xpath("//input[@id='gender-male']"));
 
  WebElement    female_bt= driver.findElement(By.xpath("//input[@id='gender-female']"));
 
  male_bt.click();
  System.out.println(male_bt.isSelected());
  System.out.println(female_bt.isSelected());
  System.out.println("after selectting female.....");
  female_bt.click();
  System.out.println(male_bt.isSelected());
  System.out.println(female_bt.isSelected());
  
WebElement check=  driver.findElement(By.xpath("//input[@id='Newsletter']"));
System.out.println("before click.....");
System.out.println(check.isSelected());
System.out.println("after click....");
System.out.println(check.isSelected());

  
      
	}

}
