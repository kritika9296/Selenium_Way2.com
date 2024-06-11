package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackForward {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kriti\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement artOfTestingLogo = driver.findElement(By.xpath("//div[@id='primary-menu']/ul/li/a[text()='Tools by ArtOfTesting']"));
		artOfTestingLogo.click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();

	}
}
