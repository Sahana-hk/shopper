package programs;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				 "./softwares/geckodriver.exe");
   WebDriver driver=new FirefoxDriver();
   driver.get("https://www.Amazon.in/");
   Thread.sleep(2000);
  //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("oneplus mobile");
  //Thread.sleep(2000);
  //driver.findElement(By.xpath("//input[@type='submit']")).click();
    Thread.sleep(2000);
    //driver.findElement(By.xpath("//img[@class='s-image']")).click();
    //Thread.sleep(2000);
    //driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
    List<WebElement> image = driver.findElements(By.xpath("//img"));
    
  
	/*//\int count = image.size();
    System.out.println(count);
    for(int i=0;i<count;i++)
    {
    	WebElement we = image.get(i);
    	String t=we.getText();
    	System.out.println(t);
    }*/
    

}
}
