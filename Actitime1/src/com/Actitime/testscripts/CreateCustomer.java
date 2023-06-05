package com.Actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.genericLibrary.BaseClass;
import com.Actitime.genericLibrary.FileLibrary;
import com.Actitime.pom.HomePage;
import com.Actitime.pom.TaskPage;

public class CreateCustomer extends BaseClass{
	
	@Test
	public void createcustomer() throws EncryptedDocumentException, IOException {
	HomePage hp=new HomePage(dr);
	hp.getTasktab().click();
	TaskPage tp=new TaskPage(dr);
	tp.getAddnewbtn().click();
	tp.getNewcustbtn().click();
	FileLibrary f1=new FileLibrary();
	String customer = f1.ReadDataFromExcel("Sheet1",4,1);
tp.getCustname().sendKeys(customer);
String desp = f1.ReadDataFromExcel("Sheet1", 4, 2);
tp.getCustdesp().sendKeys(desp);
tp.getCreatebtn().click();
String expectedresult = customer;
Object actualresult = dr.findElement(By.xpath("(//div[.='"+customer+"'])[2])")).getText();
SoftAssert s=new SoftAssert();
s.assertEquals(actualresult, expectedresult);


	
	
	
	
	}

	 
}
