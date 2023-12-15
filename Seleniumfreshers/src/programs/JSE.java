package programs;

import java.util.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSE 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver",
				 "./softwares/geckodriver.exe");
  WebDriver driver=new FirefoxDriver();
  /*driver.get("https://www.amazon.com/");
  JavascriptExecutor js=(JavascriptExecutor) driver;
  for (int i = 0; i <3; i++) 
  {
	  js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(1000);
} 
	for (int  j=0; j<3; j++) 
	{
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(1000);
		
	}*/  
  driver.get("file:///C:/Users/Administrator/Desktop/disable.html");
  JavascriptExecutor js=(JavascriptExecutor) driver;
  js.executeScript("document.getElementById('a1').value='sanju' ");
  js.executeScript("document.getElementById('a1').value='' ");
  
  
		
	}

	}


