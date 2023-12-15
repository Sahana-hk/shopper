package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Partial 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				 "./softwares//.exe");
    WebDriver driver=new FirefoxDriver();
    driver.get("file:///C:/Users/Administrator/Desktop/Facebook.html");
    Thread.sleep(2000);
   driver.findElement(By.partialLinkText("google")).click();

}
}

