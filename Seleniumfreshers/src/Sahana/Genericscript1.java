package Sahana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Genericscript1 {
	public WebDriver driver;
	@BeforeMethod

	public void openapp()
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}

}
