package dsalgo.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Configuration.Config;

public class GraphPO {

	WebDriver driver;

	public GraphPO(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='graph']")
	WebElement GetStart;

	public void graphIntro()

	{
		GetStart.click();
	}

	

	@FindBy(linkText = "Try here>>>")
	WebElement TH;

	public void Try() {
		TH.click();
	}

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement edit;

	public void text() {
		edit.sendKeys(Config.pythoncode);
	}

	@FindBy(xpath = "//button[@onclick='runit()']")
	WebElement runClick;

	public void run() {
		runClick.click();
	}

	public void graphlink() throws InterruptedException
	{
		List<WebElement> links = driver.findElements(By.className("list-group-item"));
		System.out.println("Total num of links in a page:" + links.size());

		for (int i = 0; i < links.size(); i++) {

			links.get(i).click();
			System.out.println("link = " + links.get(i));

			Try();
			Thread.sleep(2000);
			text();
			Thread.sleep(1000);
			run();

			driver.get("https://dsportalapp.herokuapp.com/graph/");

			if (i < links.size()) {
				links = driver.findElements(By.className("list-group-item"));
			}
			System.out.println("link out= " + links.get(i));

		}
	}

}
