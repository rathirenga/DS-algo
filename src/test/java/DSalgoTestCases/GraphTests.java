package DSalgoTestCases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Configuration.Config;
import dsalgo.Base.BaseClass;
import dsalgo.PageObject.GraphPO;
import dsalgo.PageObject.LoginPageObject;

public class GraphTests extends BaseClass {
	@Test
	public static void graph() throws Exception {

		// TC_LoginTest signin=new TC_LoginTest(); signin.Login();

		driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")).click();
		driver.findElement(By.linkText("Graph")).click();

		GraphPO GPO = new GraphPO(driver);
		GPO.graphlink();

		driver.findElement(By.linkText("Sign out")).click();
		driver.close();
	}

}
