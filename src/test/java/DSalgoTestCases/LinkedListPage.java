package DSalgoTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Configuration.Config;
import dsalgo.Base.BaseClass;
import dsalgo.PageObject.LinkedPO;
import dsalgo.PageObject.LoginPageObject;

public class LinkedListPage extends BaseClass {

	@Test
	public static void LinkList() throws InterruptedException {

		driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")).click();
		driver.findElement(By.linkText("Linked List")).click();
		LinkedPO LPO = new LinkedPO(driver);

		List<WebElement> links = driver.findElements(By.xpath("//a[@class='list-group-item']"));
		System.out.println("Total num of links in a page" + links.size());
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
			links.get(i).click();
			Thread.sleep(3000);
			LPO.Try();
			LPO.text();
			LPO.run();
			Thread.sleep(2000);
			driver.get("https://dsportalapp.herokuapp.com/linked-list/");

			if (i < links.size()) {
				links = driver.findElements(By.className("list-group-item"));
			}

		}

	}
}
