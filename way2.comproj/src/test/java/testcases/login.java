package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.testBase;

public class login extends testBase{

	
	@Test
	public void loginasAdmin() {
		driver.findElement(By.xpath(OR.getProperty("username"))).sendKeys("Admin");
		driver.findElement(By.xpath(OR.getProperty("passowrd"))).sendKeys("admin123");
		driver.findElement(By.xpath(OR.getProperty("login"))).click();
		String actual=driver.findElement(By.xpath(OR.getProperty("dashborad"))).getText();
		Assert.assertEquals(actual, "Dashboard");
		
		
	}
	
}
