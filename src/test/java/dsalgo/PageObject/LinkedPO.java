package dsalgo.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Configuration.Config;

public class LinkedPO {

	WebDriver driver;

	public LinkedPO(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='linked-list']")
	WebElement LinkIntro;

	public void GetStart() {
		LinkIntro.click();
	}

	@FindBy(linkText = "Try here>>>")
	WebElement TH;
	public void Try() {
		TH.click();
	}

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement edit;
	public void text()
	{
		edit.sendKeys(Config.pythoncode);
	}

	@FindBy(xpath = "//button[@onclick='runit()']")
	WebElement runClick;
	public void run()
	{
		runClick.click();
		
	}


	
}
