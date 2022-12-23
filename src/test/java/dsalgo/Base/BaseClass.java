package dsalgo.Base;

import java.time.Duration;
import Configuration.Config;
import Utility.ScreenShot;
import dsalgo.PageObject.LoginPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	@BeforeSuite
	
	/*
	 * //@Parameters("browser")
	 */	public static void InitializeDriver() {

		System.out.println("Started herere 11111111111111");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// Check if parameter passed from TestNG is 'firefox'
		/*
		 * if (browser.equalsIgnoreCase("firefox")) { // create firefox instance
		 * 
		 * WebDriverManager.firefoxdriver().setup();
		 * 
		 * driver = new FirefoxDriver(); } else if (browser.equalsIgnoreCase("chrome"))
		 * { WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); }
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get(Config.URL);
		driver.findElement(By.linkText("Get Started")).click();
		System.out.println("Started herere 333333333333333333333");
		
		
	}
	


}
