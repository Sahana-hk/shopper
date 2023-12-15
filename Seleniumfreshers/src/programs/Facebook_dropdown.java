package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_dropdown 
{
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				 "./softwares/geckodriver.exe");
   WebDriver driver=new FirefoxDriver();
   driver.get("https://www.facebook.in");
   Thread.sleep(1000);
   driver.findElement(By.xpath("//a[text()='Create new account']")).click();
   WebElement drop = driver.findElement(By.xpath("//select[@name='birthday_day']"));
   WebElement drop1 = driver.findElement(By.xpath("//select[@id='month']"));
   WebElement drop2 = driver.findElement(By.xpath("//select[@id='year']"));
   Select sel=new Select(drop); 
   Thread.sleep(1000);
   sel.selectByVisibleText("28");
   Select sel1=new Select(drop1); 
   Thread.sleep(1000);
   sel1.selectByVisibleText("Mar");
   Select sel2=new Select(drop2); 
   Thread.sleep(1000);
   sel2.selectByVisibleText("2001");
  
}
}
