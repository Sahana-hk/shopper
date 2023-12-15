package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				 "./softwares/geckodriver.exe");
   WebDriver driver=new FirefoxDriver();
   driver.get("https://www.facebook.com/");
 driver.findElement(By.id("email")).sendKeys("sahanahk032002@gmail.com");
 driver.findElement(By.id("pass")).sendKeys("Happy@123");
driver.findElement(By.name("login")).click();
   WebDriverWait wait=new WebDriverWait(driver, 10);
   wait.until(ExpectedConditions.urlContains("https://www.facebook.com/"));
   System.out.println(driver.getTitle());
 
  
   
  }

}
