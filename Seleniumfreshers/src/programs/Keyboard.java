package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keyboard {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/keyboard?sublist=0");
		WebElement ele = driver.findElement(By.xpath("//input[@id='email']"));
		ele.sendKeys(Keys.ENTER);
		 

	}

}
