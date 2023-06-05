package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage {
	
	
	//declration
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasktab;
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reporttab;
	
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement usertab;
	
	@FindBy(id="Logout")
	private WebElement lgbtn;
	
	
	//initialization
	
	public HomePage(WebDriver dr){
		PageFactory.initElements(dr, this);
		
	}


	public WebElement getTasktab() {
		return tasktab;
	}


	public WebElement getReporttab() {
		return reporttab;
	}


	public WebElement getUsertab() {
		return usertab;
	}


	public WebElement getLgbtn() {
		return lgbtn;
	}
	


}
