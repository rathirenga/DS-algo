package Utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static void captureScreenshot(WebDriver driver)
	{
		Calendar calendar = Calendar.getInstance();
		 SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		try
		{
			TakesScreenshot scrennshot=(TakesScreenshot) driver; File
			  src=scrennshot.getScreenshotAs(OutputType.FILE); 
			
			 File destFile=new File(
					  "C:\\Users\\Rengarajan\\eclipse-workspace\\DS-algo\\src\\test\\resources\\Screenshots1"+formater.format(calendar.getTime())+ ".png");
					  
					  FileUtils.copyFile(src, destFile); System.out.println("Screenshot taken");
		
	
	}
		catch(Exception e)
		{
			System.out.println("Exception while taking screemshot" + e.getMessage());
		}
	}

}
