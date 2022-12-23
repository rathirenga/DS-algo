package dsalgo.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
WebDriver driver;
public LoginPageObject(WebDriver driver)
{
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	}



@FindBy(linkText="Sign in") WebElement sigin;

public void clicksign() {
	sigin.click();
}
@FindBy(name="username") WebElement unametxt;

public void setUserName(String uname)
{
	unametxt.sendKeys(uname);
	}

@FindBy(name="password") WebElement pswdtxt;

public void setPassword(String pwd)
{
	
	pswdtxt.sendKeys(pwd);
	
	}

@FindBy(xpath="//input[@type='submit']") WebElement submitbtn;

public void clickbtn()
{
	submitbtn.click();
	}


}
