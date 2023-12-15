package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class methos 
{
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			 "./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
Thread.sleep(2000);
driver.manage().window().maximize();
driver.navigate().to("https://www.google.com");
Thread.sleep(2000);
driver.navigate().to("file:///C:/Users/Administrator/Desktop/ALL.html");
driver.navigate().to("https://www.facebook.com");
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(2000);
Dimension d=new Dimension(200, 300);
driver.manage().window().setSize(d);
Thread.sleep(2000);
Point p=new Point(200, 300);
driver.manage().window().setPosition(p);
Thread.sleep(2000);
driver.manage().window().maximize();
Thread.sleep(2000);
WebElement ele = driver.findElement(By.xpath("//input[@value='abc']"));
ele.sendKeys(Keys.CONTROL+"ax");
Thread.sleep(2000);
ele.sendKeys(Keys.DELETE);
 ele= driver.findElement(By.name("email"));
ele.sendKeys("selenium",Keys.TAB+"122334",Keys.ENTER);
 ele = driver.findElement(By.name("login"));
ele.sendKeys(Keys.ENTER);





		

}
}
