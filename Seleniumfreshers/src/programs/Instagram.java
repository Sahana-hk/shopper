package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagram
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				 "./softwares/geckodriver.exe");
   WebDriver driver=new FirefoxDriver();
   driver.get("https://www.instagram.com/");
   Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sahanahk032002@gmail.com");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Happy@123");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//button[@type='submit']")).click();	
  }

}



