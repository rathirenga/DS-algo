package DSalgoTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Configuration.Config;
import dsalgo.Base.BaseClass;
import dsalgo.PageObject.LoginPageObject;
import dsalgo.PageObject.QueuePageObject;
import dsalgo.PageObject.StackPO;

public class QueueTestCase extends BaseClass {

	@Test
	public static void queue() throws InterruptedException {
		//TC_LoginTest signin = new TC_LoginTest();
		//signin.Login();
		driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")).click();
		driver.findElement(By.linkText("Queue")).click();
		QueuePageObject QPO = new QueuePageObject(driver);
		// QPO.queuelink();

		List<WebElement> links = driver.findElements(By.className("list-group-item"));
		System.out.println("Total num of links in a page:" + links.size());

		for (int i = 0; i < links.size(); i++) {

			links.get(i).click();
			System.out.println("link = " + links.get(i));
			Thread.sleep(1000);
			QPO.Try();
			Thread.sleep(1000);
			QPO.text();
			Thread.sleep(1000);
			QPO.run();

			driver.get("https://dsportalapp.herokuapp.com/queue/");
			if (i < links.size()) {
				links = driver.findElements(By.className("list-group-item"));
			}
			System.out.println("link out= " + links.get(i));

		}

	}

}
