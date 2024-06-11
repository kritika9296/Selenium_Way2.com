package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class testBase {
    public static WebDriver driver; //noinitialization here will be intialized at runtime based on values given in cofig properties file)
    public static Properties config=new Properties();
    public static Properties OR=new Properties();
    public static FileInputStream fis;
	
	@BeforeSuite
	public void SetUp() throws IOException {   //created for running before any suite before excuting alltestcasesonce
		
		if(driver==null) {
			fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
	    	//This line is like opening a file in your project. 
	    	config.load(fis);//This line reads the contents of the file (the special book) into your config
	    	//So, in summary, these lines of code are like getting instructions (settings) from a special book (config.properties file) in your Selenium project, and you are checking what browser is specified in those instructions. This helps you set up your Selenium tests according to your project's configuration
	    	fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
	    	OR.load(fis);
	    if(config.getProperty("browser").equals("chrome")) {
	    
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\kriti\\eclipse-workspace\\way2.comproj\\src\\test\\resources\\Executables\\chromedriver.exe");
	    	driver=new ChromeDriver();
	    }// else me we can add firfox or edge same way
	    String s= config.getProperty("siteUrl");
	   	System.out.println(s);
	   driver.get(config.getProperty("siteUrl"));
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("timtake")), TimeUnit.SECONDS);
	    
		}
		
	}
	
	@AfterSuite
  public void TearDown() {   //created for running after any suite, after execting all tc once
		
		 	
		
	}
	
	
	
}
