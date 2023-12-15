package programs;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class practice
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
      driver.get("https://skpatro.github.io/demo/links/");
       driver.findElement(By.name("NewWindow")).click();
       Set<String> all = driver.getWindowHandles();
       for (String s : all) 
       {
    	   driver.switchTo().window(s);
    	   System.out.println(driver.getTitle());
    	   if(s.equals("all"))
    	   {
    		 System.out.println("true");  
    	   }
    	   else
    	   {
    		   System.out.println("false");
    	   }
    	   driver.findElement(By.xpath("//div[@class='container']"));
    	   TakesScreenshot ts=(TakesScreenshot) driver;
    	   File src=ts.getScreenshotAs(OutputType.FILE);
    	   File dst=new File("C:\\Users\\Administrator\\Pictures\\Screenshots\\sahan.jpg");
	FileHandler.copy(src, dst);
       }
      
		
		
		
		
		
		
}
}
