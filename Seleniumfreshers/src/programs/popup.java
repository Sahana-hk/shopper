package programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popup
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				 "./softwares/geckodriver.exe");
   WebDriver driver=new FirefoxDriver();
   //driver.get("https://demo.guru99.com/test/delete_customer.php");
   driver.get("https://www.redbus.com/");
   //driver.findElement(By.name("submit")).click();
   driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
   Thread.sleep(1000);
   driver.findElement(By.xpath("(//span[text()='30'])[2]")).click();
   Thread.sleep(1000);
   //driver.findElement(By.xpath("")).click();   
   //Alert a=driver.switchTo().alert();
 //System.out.println(a.getText());
  // a.accept();
   //a.dismiss();
   //driver.close();
}
}
