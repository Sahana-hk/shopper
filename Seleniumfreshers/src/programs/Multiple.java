package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				 "./softwares/geckodriver.exe");
   WebDriver driver=new FirefoxDriver();
   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   driver.get("https://demoapps.qspiders.com/");
  // Thread.sleep(2000);
 // driver.findElement(By.cssSelector("section[class='poppins']")).click();
  //Thread.sleep(2000);
  driver.findElement(By.cssSelector("input[id='name']")).sendKeys("sahana");
  //Thread.sleep(2000);
  driver.findElement(By.cssSelector("input[id='email']")).sendKeys("sahana@123");
  //Thread.sleep(2000);
  driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Happy@123");
  //Thread.sleep(2000);
  driver.findElement(By.cssSelector("button[type='submit']")).click();
  driver.findElement(By.cssSelector("a[href='/button']")).click();
  //Thread.sleep(2000);
  driver.findElement(By.cssSelector("button[id='btn']")).click();
  //Thread.sleep(2000);
  driver.findElement(By.cssSelector("button[id='btn2']")).click();
  //Thread.sleep(2000);
  driver.findElement(By.cssSelector("button[id='btn6']")).click();
  //Thread.sleep(2000);
  driver.findElement(By.cssSelector("a[href='/link']")).click();
  //Thread.sleep(2000);
  driver.findElement(By.cssSelector("a[href='/link/payment']")).click();
  //Thread.sleep(2000);
  driver.findElement(By.cssSelector("a[href='/dropdown']")).click();
  //Thread.sleep(2000);
  driver.findElement(By.cssSelector("input[id='personName']")).sendKeys("sahana");
  //Thread.sleep(2000);
  
  
  
  
  
  }

}


