package dsalgo.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Configuration.Config;

public class arraypagetest {

	public class arrayPages
	{
	WebDriver driver;

	@FindBy (xpath="//div[@class='nav-item dropdown']/a") WebElement ddList;
	//@FindBy (xpath="//div[@class='dropdown-menu show']/a[1]") WebElement arrayLink;
	@FindBy (linkText="Arrays") WebElement arrayLink;
	@FindBy (xpath="//a[text()='Arrays in Python']") WebElement aPython;
	@FindBy (xpath="//a[@class='btn btn-info']") WebElement tryLink;
	@FindBy (xpath="//form[@id='answer_form']/div/div/div/textarea") WebElement editor;
	@FindBy (xpath="//button[text() = 'Run']") WebElement runLink;

	public void arraypagetest(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	System.out.println("Arrays");
	}

	public void itemClick()
	{
	ddList.click();
	arrayLink.click();
	}

	public void arrPython()
	{
	aPython.click();
	}

	public void tryEditor()
	{
	tryLink.click();
	}

	public void typeCode()
	{
	editor.sendKeys("print('Hello World')");
	//System.out.println("Code Entered");
	}

	public void runClick()
	{
	runLink.click();
	//System.out.println("After Run Click");
	}

	public void goBack()
	{
	driver.navigate().back();
	}

	public void arrEltClick() throws InterruptedException
	{
	List<WebElement> arrList = driver.findElements(By.xpath("//a[@class='list-group-item']"));
	int size=arrList.size();
	System.out.println(size);
	for(int i=0;i<size;i++)
	{
	Thread.sleep(500);
	System.out.println(arrList.get(i).getText());
	arrList.get(i).click();
	tryEditor();
	typeCode();
	runClick();
	driver.get("https://dsportalapp.herokuapp.com/array/");
	arrList=driver.findElements(By.xpath("//a[@class='list-group-item']"));
	}

	}

	public void practiceQues()
	{
	arrPython();
	WebElement PQ=driver.findElement(By.xpath("//div[@id='content']/a"));
	System.out.println(PQ.getText());
	PQ.click();

	List<WebElement> PQList = driver.findElements(By.xpath("//a[@class='list-group-item']"));
	int size=PQList.size();
	System.out.println(size);
	for(int i=0;i<size;i++)
	{
	System.out.println(PQList.get(i).getText());
	PQList.get(i).click();
	editor.sendKeys(Keys.CONTROL,"a");
	editor.sendKeys(Keys.DELETE);
	typeCode();
	runClick();
	driver.get("https://dsportalapp.herokuapp.com/array/practice");
	PQList=driver.findElements(By.xpath("//a[@class='list-group-item']"));
	}

	driver.navigate().back();
	}
	}
	}
	

