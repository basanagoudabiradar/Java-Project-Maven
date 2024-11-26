package day33;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicPagination {

    public static void main(String[] args) {
       

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/admin/index.php");

        WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
        username.clear();
        username.sendKeys("demo");

        WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
        password.clear();
        password.sendKeys("demo");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        if (driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()) {
            driver.findElement(By.xpath("//button[@class='btn-close']")).click();
        }

        driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
        driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();

        // Add any further code needed for pagination handling here

        // Close the browser
        driver.quit();
    }
}