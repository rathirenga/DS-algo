package DSalgoTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import dsalgo.Base.BaseClass;
import dsalgo.PageObject.ArrayPageObject;
import dsalgo.PageObject.DataStructurePO;
import dsalgo.PageObject.LinkedPO;

public class FinalTestCase extends BaseClass {

	//@Test
	/*public static void finalTest() throws InterruptedException {
		
		//Login
		
		TC_LoginTest signin = new TC_LoginTest();
		signin.Login();

		// DataStructure Module

		DataStructure dStruct = new DataStructure();
		dStruct.ds();

		
		// ArrayModule
		
		driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")).click();
		driver.findElement(By.linkText("Arrays")).click();

		

		System.out.println("-----------Array Module-------");
		System.out.println("*****************");

		ArrayPage AP = new ArrayPage();
		AP.array();

		// LinkedList

		System.out.println("--------LinkedList Module------");
		System.out.println("*****************");

		driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")).click();
		driver.findElement(By.linkText("Linked List")).click();

		LinkedListPage LP = new LinkedListPage();
		LP.LinkList();

	}*/
}
