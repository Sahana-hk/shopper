package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook111
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				 "./softwares/geckodriver.exe");
   WebDriver driver=new FirefoxDriver();
   driver.get("https://www.facebook.com/");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sahanahk032002@gmail.com");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Happy@123");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//button[@name='login']")).click();

}
}
