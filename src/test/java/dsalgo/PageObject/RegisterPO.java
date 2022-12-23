package dsalgo.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPO {

	WebDriver driver;

	public RegisterPO(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='/register']")
	WebElement link;

	public void RegisterLink() {
		link.click();
	}

	@FindBy(name = "username")
	WebElement unametxt;

	public void setUName(String uname) {
		unametxt.sendKeys(uname);
	}

	@FindBy(name = "password1")
	WebElement ptxt;

	public void setPwd(String pswd)

	{
		ptxt.sendKeys(pswd);

	}

	@FindBy(name = "password2")
	WebElement ptxt2;

	public void setPwd2(String pswd2)

	{
		ptxt2.sendKeys(pswd2);

	}

	@FindBy(xpath = "//input[@value='Register']")
	WebElement RegBtn;

	public void Regbt() {
		RegBtn.click();
	}
}
