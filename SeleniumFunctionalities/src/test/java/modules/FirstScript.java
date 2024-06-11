package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kriti\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 //Declaration of variables
		 String url = "http://softwaretestingmaterial.com";
		 String expectedTitle = "Software Testing Material";
		 String actualTitle = null;
		 driver.navigate().to("http://softwaretestingmaterial.com");;
		 actualTitle=driver.getTitle();
		 System.out.println(actualTitle);
		 if(actualTitle.contentEquals(expectedTitle)) {
			 System.out.println("Test passed");		
			 System.out.println(expectedTitle);
			 
		 }
		 else {
			 System.out.println("Test failed");
			 System.out.println(expectedTitle);
		 }
				 

	}

}
