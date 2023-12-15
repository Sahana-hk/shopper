package Test1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Genericcript 
{
	public WebDriver driver;
	@BeforeMethod

	public void openapp()
	{
		System.setProperty("Webdriver.gecko.driver","./Softwares/geckodriver.exe");
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
}
