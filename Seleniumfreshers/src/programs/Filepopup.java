package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filepopup
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver",
				 "./softwares/geckodriver.exe");
  WebDriver driver=new FirefoxDriver();
  driver.get("file:///C:/Users/Administrator/Desktop/popup.html");
    WebElement ele = driver.findElement(By.name("upload file"));
    ele.sendKeys("C:\\Users\\Administrator\\Desktop\\SAHANA RESUM DOC.pdf");

}
}
