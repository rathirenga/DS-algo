package DSalgoTestCases;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Configuration.Config;
import dsalgo.Base.BaseClass;
import dsalgo.PageObject.ArrayPageObject;
import dsalgo.PageObject.LoginPageObject;
import dsalgo.PageObject.arraypagetest;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ArrayPage extends BaseClass {

	@Test
	public static void array() throws InterruptedException {
		
			
			  driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")).click(); 
			  driver.findElement(By.linkText("Arrays")).click();
			 
		
		ArrayPageObject APO = new ArrayPageObject(driver);
		/*
		 * arraypagetest ap=new arraypagetest(driver); ap.arrylist();
		 */
		
		  List<WebElement> links =
		  driver.findElements(By.xpath("//a[@class='list-group-item']"));
		  
		  System.out.println("Total num of links in a page" + links.size());
		  
		  for (int i = 0; i < links.size(); i++) {
		  System.out.println(links.get(i).getText()); links.get(i).click();
		  
		  Thread.sleep(3000); APO.Try(); APO.text(); Thread.sleep(2000); APO.run();
		  Thread.sleep(1000);
		  
		  driver.get("https://dsportalapp.herokuapp.com/array/");
		  
		  if (i < links.size()) { links =
		  driver.findElements(By.className("list-group-item")); }
		  
		  }
		 
		driver.get("https://dsportalapp.herokuapp.com/array/applications-of-array/");
		APO.practice();
		List<WebElement> links2 = driver.findElements(By.xpath("//a[@class='list-group-item']"));
		System.out.println("Total num of links in a page" + links2.size());

		for (int j = 0; j < links2.size(); j++) {
			System.out.println(links2.get(j).getText());
			links2.get(j).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys(Keys.CONTROL + "a");

			driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys(Keys.DELETE);

			APO.text();
			APO.run();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

			driver.get("https://dsportalapp.herokuapp.com/array/practice");
			if (j < links2.size()) {
				links2 = driver.findElements(By.xpath("//a[@class='list-group-item']"));
			}

		}

	}

}
