package DataDrivenTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DSalgoTestCases.DataStructure;
import dsalgo.Base.BaseClass;
import dsalgo.PageObject.LoginPageObject;

public class CredentialsFromExcel extends BaseClass{

	static FileInputStream fis;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	@Test(dataProvider="LoginData")
	public void loginData(String user, String pwd)
	{
			LoginPageObject lp=new LoginPageObject(driver);
			lp.clicksign();
			lp.setUserName(user);
			lp.setPassword(pwd);
			lp.clickbtn();
	}
	
	
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
 fis=new FileInputStream("C:\\Users\\Rengarajan\\eclipse-workspace\\DS-algo\\src\\test\\resources\\ExcelSheet\\Login.xlsx");
		
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
				//read the value from a cell
				logindata[i-1][j]=getCellData(i,j);
				
			}
			
			
		}
		return logindata;		
		
	}
	public static String getCellData(int rowCount,int colCount) throws IOException

	{
		
		  fis=new FileInputStream(
		  "C:\\Users\\Rengarajan\\eclipse-workspace\\DS-algo\\src\\test\\resources\\ExcelSheet\\Login.xlsx"
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
