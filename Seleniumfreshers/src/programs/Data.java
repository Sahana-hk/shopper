package programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Data 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver",
				 "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		
		
	}

}
