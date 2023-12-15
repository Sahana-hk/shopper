package programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class QSPIDERS 
{
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.gecko.driver",
				 "./softwares/geckodriver.exe");
   WebDriver driver=new FirefoxDriver();
   driver.get("https://www.qspiders.com/courses");
   Thread.sleep(1000);
   JavascriptExecutor js=(JavascriptExecutor) driver;
   for (int i = 0; i <1; i++) 
   {
 	  js.executeScript("window.scrollBy(0,500)");
 	Thread.sleep(1000);
 } 
   WebElement ele = driver.findElement(By.xpath("(//span[text()='Details'])[6]"));
	Actions act=new Actions(driver);
	act.contextClick(ele).perform();
	Thread.sleep(1000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	Thread.sleep(1000);
	Set<String> allwh = driver.getWindowHandles();
	 for (String wh : allwh) 
		 {
    	 driver.switchTo().window(wh);
		 }
   	  js.executeScript("window.scrollBy(0,500)");
   	Thread.sleep(1000);
   driver.findElement(By.xpath("(//p[@class='card-header-title has-text-persian'])[3]")).click();
   TakesScreenshot ts=(TakesScreenshot)driver;
   File src = ts.getScreenshotAs(OutputType.FILE);
   File dst=new File("C:\\Users\\Administrator\\Pictures\\Screenshots\\sa.jpg");
  FileHandler.copy(src, dst);
   List<WebElement> s = driver.findElements(By.xpath("//div[@class='content']"));
  for (WebElement we : s)
  {
	  System.out.println(we.getText());
	}
  driver.close();	}
  }


