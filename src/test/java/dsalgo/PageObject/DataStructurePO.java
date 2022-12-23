package dsalgo.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Configuration.Config;

public class DataStructurePO {

	WebDriver driver;

	public DataStructurePO(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='data-structures-introduction']")
	WebElement dsIntro;

	public void GetStart() {
		dsIntro.click();
	}

	@FindBy(linkText = "Time Complexity")
	WebElement TC;

	public void Time() {
		TC.click();
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

}
