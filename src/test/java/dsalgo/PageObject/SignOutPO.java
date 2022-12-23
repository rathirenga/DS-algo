package dsalgo.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOutPO {

	WebDriver driver;

	public SignOutPO(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Sign out")
	WebElement signout;

	public void clicksignout() {
		signout.click();

	}

}
