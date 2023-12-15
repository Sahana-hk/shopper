package programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Href
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				 "./softwares/geckodriver.exe");
   WebDriver driver=new FirefoxDriver();
   driver.get("https://www.Amazon.in/");
   Thread.sleep(2000);
   List<WebElement> links = driver.findElements(By.xpath("//a"));
   for(WebElement w:links)
   {
	   System.out.println(w.getAttribute("href"));
   }
   

}
}