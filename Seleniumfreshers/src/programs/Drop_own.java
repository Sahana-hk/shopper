package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_own
{
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				 "./softwares/geckodriver.exe");
   WebDriver driver=new FirefoxDriver();
   driver.get("file:///C:/Users/Administrator/Desktop/drop_down.html");
   Thread.sleep(2000); 
   WebElement drop = driver.findElement(By.xpath("//select[@id='drop_down']"));
   Select sel=new Select(drop);
  /* if(sel.isMultiple())
   {
	   System.out.println("multi select");
   }
   else
   {
	   System.out.println("single select");
   }*/
   /*sel.selectByIndex(0);
   Thread.sleep(1000);
   sel.selectByValue("B");
   Thread.sleep(1000);
   sel.selectByVisibleText("Mandya");
   Thread.sleep(1000);*/
   sel.deselectByIndex(0);
   Thread.sleep(1000);
   sel.deselectAll();
   
   
   
   
   
   
   
   
   
}
}
