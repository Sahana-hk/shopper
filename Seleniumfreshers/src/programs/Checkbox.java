package programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				 "./softwares/geckodriver.exe");
   WebDriver driver=new FirefoxDriver();
   driver.get("file:///C:/Users/Administrator/Desktop/ALL.html");
List<WebElement> check = driver.findElements(By.xpath("//input"));
int count = check.size();
System.out.println(count);
//for(int i=0;i<count;i++)
	//for(int i=count-1;i>=0;i--)
for(WebElement we:check)
{
	//WebElement e=check.get(i);
 we.click();
	//System.out.println(e);
	
}

	
	}
}
