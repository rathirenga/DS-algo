package DSalgoTestCases;

import org.testng.annotations.Test;

import dsalgo.Base.BaseClass;
import dsalgo.PageObject.SignOutPO;

public class SignOutTestCase extends BaseClass {

	@Test
	public void signout()
	{
		
		TC_LoginTest signin=new TC_LoginTest();
		signin.Login();
		
		SignOutPO SO=new SignOutPO(driver);
		SO.clicksignout();
	}
}
