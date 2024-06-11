package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWebpage {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kriti\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("Buddha");
		WebElement button=driver.findElement(By.className("vh79eN"));
		button.click();
		//Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,2500)");

		//Verifying that page got scrolled  and "page-2" text is visible now 
		//and more products become visible
	
	

	}
}
