package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				 "./softwares/geckodriver.exe");
    WebDriver driver=new FirefoxDriver();
    driver.get("file:///C:/Users/Administrator/Desktop/link.html");
    Thread.sleep(2000);
   // driver.findElement(By.tagName("a")).click();
    //driver.findElement(By.id("a1")).click();
    //driver.findElement(By.name("n1")).click();
    driver.findElement(By.className("c1")).click();
	}

}
