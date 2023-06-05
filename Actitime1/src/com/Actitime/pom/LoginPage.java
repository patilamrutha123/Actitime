package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//utilization
	
	public WebElement getUnbtx() {
		return unbtx;
	}



	public WebElement getPwtbx() {
		return pwtbx;
	}



	public WebElement getLgbtn() {
		return lgbtn;
	}



	//declaration
	@FindBy(id= "username")
	private WebElement unbtx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgbtn;
	
	
	
	//initiolization
	
	public LoginPage(WebDriver dr) {
		PageFactory.initElements(dr, this);
	}
}
