package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoqspider 
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				 "./softwares/geckodriver.exe");
   WebDriver driver=new FirefoxDriver();
   driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
   Thread.sleep(1000);
   driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8465783903");
   Thread.sleep(1000);
   WebElement drop = driver.findElement(By.xpath("//select[@id='select2']"));
   Select sel=new Select(drop);
   sel.selectByVisibleText("Female");
   WebElement drop1 = driver.findElement(By.xpath("//select[@id='select3']"));
   Select sel1=new Select(drop1);
   sel1.selectByVisibleText("India");
   WebElement drop2= driver.findElement(By.xpath("//select[@id='select5']"));
   Select sel2=new Select(drop2);
   sel2.selectByVisibleText("Karnataka");
   WebElement drop3= driver.findElement(By.id("select_city"));
   Select sel3=new Select(drop3);
   sel3.selectByVisibleText("Mysore");
   /*driver.findElement(By.xpath("//button [@id='continuebtn']")).click();
   driver.navigate().to("https://demoapps.qspiders.com/dropdown?sublist=0");
   driver.get("https://demoapps.qspiders.com/dropdown?sublist=1");
   Thread.sleep(1000);
  driver.findElement(By.xpath("//a[@href='/dropdown/multiSelect?sublist=1']")).click();
  WebElement ele = driver.findElement(By.id("state"));
  Select s=new Select(ele);
  List<WebElement> opt = s.getOptions();
  ArrayList<String> l=new ArrayList<String>();
	WebElement we = null;
	System.out.println(we.getText());
	int count = opt.size();
    System.out.println(count);
	
	Collections.sort(l);
	for (String l1 : l) {
		System.out.println(l1);
	}
	if(l.contains("Karnataka"))
    {
    	System.out.println("option present");
     }
    else
    {
    	System.out.println("option not present");
    }*/

}
}
