package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahoo{
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver",
					 "./softwares/geckodriver.exe");
	   WebDriver driver=new FirefoxDriver();
	   driver.get("file:///C:/Users/Administrator/Desktop/swap.html");
	   WebElement ele = driver.findElement(By.xpath("//input[@value='selenium']"));
	   ele.sendKeys(Keys.CONTROL+"ax");
	   Thread.sleep(1000);
	 WebElement ele1 = driver.findElement(By.xpath("//input[@type='text2']"));
	   ele1.sendKeys(Keys.CONTROL+"v");
	   Thread.sleep(1000);
     WebElement ele2 = driver.findElement(By.xpath("//input[@type='text1']"));
	ele2.sendKeys(Keys.CONTROL+"ax");
	 Thread.sleep(1000);
	WebElement ele3 = driver.findElement(By.xpath("//input[@value='api']"));
	ele3.sendKeys(Keys.CONTROL+"v");
	 Thread.sleep(1000);
	WebElement ele4 = driver.findElement(By.xpath("//input[@type='text3']"));
	ele4.sendKeys(Keys.CONTROL+"ax");
	 Thread.sleep(1000);
	WebElement ele5 = driver.findElement(By.xpath("//input[@value='']"));
	ele5.sendKeys(Keys.CONTROL+"v");
	

	   
	
	   
	

	
	
	
	   
	}

}
