package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		WebElement src = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement dst = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src,dst).perform();
		Thread.sleep(1000);
		
		
		


	}

}
