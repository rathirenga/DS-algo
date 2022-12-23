package dsalgo.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Configuration.Config;

public class ArrayPageObject {

	WebDriver driver;

	public ArrayPageObject(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='array']")
	WebElement ArryIntro;

	public void GetStart() {
		ArryIntro.click();
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

	@FindBy(xpath = "//a[@class='list-group-item list-group-item-light text-info']")
	WebElement PQ;

	public void practice() {
		
		PQ.click();
		

	}

	}
	

