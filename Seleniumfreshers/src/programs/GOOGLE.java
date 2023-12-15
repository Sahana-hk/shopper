package programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.ResourceBundle.Control;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GOOGLE
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.google.com/");
		driver.get("https://www.selenium.dev/");
		//WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Downloads']"));
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		Thread.sleep(1000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(1000);
		
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Documentation']"));
		Actions act1=new Actions(driver);
		act1.contextClick(ele1).perform();
		Thread.sleep(1000);
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_T);
		r1.keyRelease(KeyEvent.VK_T);
		Thread.sleep(1000);
		
		WebElement ele2= driver.findElement(By.xpath("//span[text()='Projects']"));
		Actions act2=new Actions(driver);
		act2.contextClick(ele2).perform();
		Thread.sleep(1000);
		Robot r2=new Robot();
		r2.keyPress(KeyEvent.VK_T);
		r2.keyRelease(KeyEvent.VK_T);
		Thread.sleep(1000);
		
		WebElement ele3= driver.findElement(By.xpath("//span[text()='Support']"));
		Actions act3=new Actions(driver);
		act3.contextClick(ele3).perform();
		Thread.sleep(1000);
		Robot r3=new Robot();
		r3.keyPress(KeyEvent.VK_T);
		r3.keyRelease(KeyEvent.VK_T);
		Thread.sleep(1000);
		
		WebElement ele4= driver.findElement(By.xpath("//span[text()='Blog']"));
		Actions act4=new Actions(driver);
		act4.contextClick(ele4).perform();
		Thread.sleep(1000);
		Robot r4=new Robot();
		r4.keyPress(KeyEvent.VK_T);
		r4.keyRelease(KeyEvent.VK_T);
		Thread.sleep(1000);
		
		Set<String> allwh = driver.getWindowHandles();
		ArrayList<String>l=new ArrayList<String>(allwh);
         String wh=l.get(4);
         driver.switchTo().window(wh);
	
	

}
}
