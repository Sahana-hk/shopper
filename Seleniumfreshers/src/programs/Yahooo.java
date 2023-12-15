package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahooo 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				 "./softwares/geckodriver.exe");
   WebDriver driver=new FirefoxDriver();
   driver.get("https://www.yahoo.in/");
   Thread.sleep(2000);
  
  
  driver.findElement(By.xpath("//h3[text()='namaste']")).click();
    //Thread.sleep(2000);
    //driver.findElement(By.xpath("//img[@class='s-image']")).click();
    //Thread.sleep(2000);
    //driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
    //Thread.sleep(2000);

}
}
