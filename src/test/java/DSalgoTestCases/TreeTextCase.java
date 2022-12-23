package DSalgoTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Configuration.Config;
import dsalgo.Base.BaseClass;
import dsalgo.PageObject.LoginPageObject;
import dsalgo.PageObject.QueuePageObject;
import dsalgo.PageObject.TreePageObject;

public class TreeTextCase extends BaseClass {

	@Test
	public static void tree() throws InterruptedException {

		driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")).click();
		driver.findElement(By.linkText("Tree")).click();
		TreePageObject TPO = new TreePageObject(driver);
	
		List<WebElement> links = driver.findElements(By.className("list-group-item"));
		System.out.println("Total num of links in a page:" + links.size());

		for (int i = 0; i < links.size(); i++) {

			links.get(i).click();
			System.out.println("link = " + links.get(i));
			
			Thread.sleep(1000);
			TPO.Try();
			
			TPO.text();
			Thread.sleep(2000);
			TPO.runFile();
			Thread.sleep(1000);

			driver.get("https://dsportalapp.herokuapp.com/tree/");
			if (i < links.size()) {
				links = driver.findElements(By.className("list-group-item"));
			}
			System.out.println("link out= " + links.get(i));

		}

		driver.get("https://dsportalapp.herokuapp.com/tree/implementation-of-bst/");
		TPO.practice();
	}

}
