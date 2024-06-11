package modules;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowResize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kriti\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		int height=400;
		int width=600;
		Dimension dimension=new Dimension(width,height);
		driver.manage().window().setSize(dimension);
		driver.manage().window().maximize();
		driver.manage().window().setPosition(new Point(0,-1000));
		//driver.close();

	}
}
