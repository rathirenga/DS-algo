package DSalgoTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Configuration.Config;
import dsalgo.Base.BaseClass;
import dsalgo.PageObject.DataStructurePO;
import dsalgo.PageObject.LoginPageObject;

public class DataStructure extends BaseClass {
	@Test
	public static void ds() throws InterruptedException
	{
		
		
		
		 TC_LoginTest signin=new TC_LoginTest(); signin.Login();
		 
		DataStructurePO DSP= new DataStructurePO(driver);
		DSP.GetStart();
		DSP.Time();
		DSP.Try();
		Thread.sleep(1000);
		DSP.text();
		Thread.sleep(2000);
		DSP.run();
		Thread.sleep(1000);
		driver.navigate().back();
		
		
		
	
	}
	
	
}
