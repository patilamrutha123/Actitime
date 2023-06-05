package com.Actitime.genericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Actitime.pom.LoginPage;

public class BaseClass {
	FileLibrary fl=new FileLibrary();
	public WebDriver dr;
	@BeforeSuite
	public void databaseConnection() {
		Reporter.log("database connected",true);
	}
	@BeforeClass
	public void LaunchBrawser() throws IOException {
		 dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String actitimeurl = fl.ReadDataFromProprtyFile("url");              
		dr.get(actitimeurl);
		Reporter.log("Browser launched",true);
	}
	@BeforeMethod
	public void Login() throws IOException {
		LoginPage l=new LoginPage(dr);
String un = fl.ReadDataFromProprtyFile("username");
String pw = fl.ReadDataFromProprtyFile("password");
l.getUnbtx().sendKeys(un);

l.getPwtbx().sendKeys(pw);
l.getLgbtn().click();


		
		Reporter.log("Logged in to actitime",true);
		
	}
	
	
	@AfterMethod
	public void  logout() {
		
		dr.findElement(By.id("logoutLink")).click();
		Reporter.log("logged out",true);
	}
	@AfterClass
	public void CloseBrowser() {
		dr.close();
		Reporter.log("browser is closed",true);
	}
	@AfterSuite
	public void DatabaseDisconnected() {
		Reporter.log("Database is disconnected",true);
	}

}
