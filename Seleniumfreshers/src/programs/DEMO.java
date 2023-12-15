package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DEMO 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		//driver.get("https://www.myntra.com/");
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		//driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.get("https://demoapps.qspiders.com/dragDrop?sublist=0");
		//WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement tar = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		//WebElement ele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(driver);
		//act.moveToElement(men).perform();		
		act.dragAndDrop(src, tar).perform();
		//act.contextClick(ele).perform();
	}

}
