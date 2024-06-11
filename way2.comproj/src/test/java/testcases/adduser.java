package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.testBase;

public class adduser extends testBase {

	@Test
	public void adminlink() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("PIMclick"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("clickOnAdd"))).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(OR.getProperty("fname"))).sendKeys("Babby");
		driver.findElement(By.cssSelector(OR.getProperty("lname"))).sendKeys("Sharma");
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("save"))).click();
		
		
	}

	
}
