package Sahana;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Runnerscript1 extends Genericscript1{
	@Test
	public void volidlogin()
	{
		driver.findElement(By.name("username")).sendKeys("testlead");
		driver.findElement(By.name("pwd")).sendKeys("testlead");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"acttime");
		
		
	}


}
