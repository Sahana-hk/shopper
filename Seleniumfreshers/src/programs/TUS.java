package programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TUS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				 "./softwares/geckodriver.exe");
    WebDriver driver=new FirefoxDriver();
    driver.get("https://www.instagram.com/");
    Thread.sleep(2000);
     String title = driver.getTitle();
     System.out.println(title);
     String url = driver.getCurrentUrl();
     System.out.println(url);
    
    String src = driver.getPageSource();
    System.out.println(src);
	}

	
}
