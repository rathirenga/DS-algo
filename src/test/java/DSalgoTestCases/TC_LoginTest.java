package DSalgoTestCases;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Configuration.Config;
import dsalgo.Base.BaseClass;
import dsalgo.PageObject.LoginPageObject;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class TC_LoginTest extends BaseClass {

	@BeforeSuite
	public void Login() {

		LoginPageObject lp = new LoginPageObject(driver);
		System.out.println(driver.getTitle());
		lp.clicksign();
		lp.setUserName(Config.username);
		lp.setPassword(Config.password);
		lp.clickbtn();
		
		

	}

}
