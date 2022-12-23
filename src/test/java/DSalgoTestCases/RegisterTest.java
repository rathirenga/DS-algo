package DSalgoTestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.ScreenShot;
import dsalgo.Base.BaseClass;
import dsalgo.PageObject.RegisterPO;


public class RegisterTest extends BaseClass {

	

static FileInputStream fis;
static  XSSFWorkbook workbook;
static XSSFSheet sheet;

	@Test(dataProvider="Registration Data")
	public void Reg(String user,String pwd1,String pwd2) throws InterruptedException, IOException
	{
		RegisterPO rp = new RegisterPO(driver);
		rp.RegisterLink();
		rp.setUName(user);
		rp.setPwd(pwd1);
		rp.setPwd2(pwd2);
		
		rp.Regbt();
		
		Thread.sleep(2000);
		String title=driver.getTitle();
		
		if(title.equals("NumpyNinja"))
		{
			System.out.println("successfully registered in");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Sign out")).click();
		}
		else
		{
			System.out.println("please fill out thie field correctly");
	
		}
		
		ScreenShot.captureScreenshot(driver);
	
	}
	

	

	@DataProvider(name="Registration Data")
	String[][] getData() throws IOException
	{
 fis=new FileInputStream("C:\\Users\\Rengarajan\\eclipse-workspace\\DS-algo\\src\\test\\resources\\ExcelSheet\\Register.xlsx");
		
		 workbook=new XSSFWorkbook(fis);
		
		//using sheet name
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		//using sheet index
		//XSSFSheet sheet=workbook.getSheetAt(0);
		
		//returns the row count
		int rowCount=sheet.getLastRowNum(); 
		
		
		//returns the cell count in a Row 
		//int colCount=sheet.getRow(0).getLastCellNum();
		
		
		int colCount=sheet.getRow(1).getLastCellNum();
		
		String logindata[][]= new String[rowCount][colCount];
		//for(int i=0;i<rowCount;i++)
		for(int i=1;i<=rowCount;i++)
		{
			
			//Focus on the current Row
		//XSSFRow currentRow=	sheet.getRow(i);
			
			for(int j=0;j<colCount;j++)
			{
				int pwd2=0;
				//read the value from a cell
				logindata[i-1][j]=getCellData(i,j,pwd2);
				
			}
			
			
		}
		return logindata;		
		
	}
	public static String getCellData(int rowCount,int colCount,int pwd2) throws IOException

	{
		
		  fis=new FileInputStream(
		  "C:\\Users\\Rengarajan\\eclipse-workspace\\DS-algo\\src\\test\\resources\\ExcelSheet\\Register.xlsx"
		  ); 
		  workbook=new XSSFWorkbook(fis); 
		  sheet=workbook.getSheetAt(0);
		 
	XSSFRow row=sheet.getRow(rowCount);
	XSSFCell Cell=row.getCell(colCount);
	String data;
	try
	{
	DataFormatter formatter=new DataFormatter();
	String CellData=formatter.formatCellValue(Cell);
	return CellData;

	}
	catch(Exception e)
	{
	data="";
	}
	workbook.close();
	fis.close();
	return data;

	}

}
