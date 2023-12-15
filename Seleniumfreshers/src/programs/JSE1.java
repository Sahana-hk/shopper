package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSE1
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver",
				 "./softwares/geckodriver.exe");
  WebDriver driver=new FirefoxDriver();
  driver.get("https://www.amazon.in/");
  JavascriptExecutor js=(JavascriptExecutor) driver;
  WebElement brazil = driver.findElement(By.xpath("//a[text()='Brazil']"));
  Point loc=brazil.getLocation();
  int x=loc.getX();
  int y=loc.getY();
  System.out.println(x+" "+y);
  js.executeScript("window.scrollBy('+x+','+y+')");
  brazil.click();
  
}
}
