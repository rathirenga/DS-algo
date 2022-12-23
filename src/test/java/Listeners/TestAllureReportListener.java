package Listeners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import dsalgo.Base.BaseClass;
import io.qameta.allure.Attachment;

public class TestAllureReportListener implements ITestListener 
{
	private static String getTestMethodName(ITestResult iTestResult)
	{
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}

	@Attachment
	public byte[] saveFailureScreenShot(WebDriver driver)
	{
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	@Attachment(value= "{0}", type="text/plain")
	public static String saveTextLog(String message)
	{
		return message;
	}
	
	
	public void onTestFailure(ITestResult result) {
		
		System.out.println("I am in onTestFailure method" + getTestMethodName(result)+"failed");
		
		Object testClass=result.getInstance();
		WebDriver driver=BaseClass.driver;
		if(driver instanceof WebDriver)
		{
			System.out.println("Screenshot captured for failed test case" + getTestMethodName(result));
			saveFailureScreenShot(driver);
			
		}
		saveTextLog(getTestMethodName(result)+ "failed and screenshot taken");	
	}
	
	
	

}
