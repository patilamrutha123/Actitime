package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	//decleration
	@FindBy(xpath = " //div[.='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
			private WebElement newcustbtn;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesp;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createbtn;
	
	//initialization
	
public TaskPage(WebDriver dr) {
	PageFactory.initElements(dr, this);
	
}
//utilization

public WebElement getAddnewbtn() {
	return addnewbtn;
}

public WebElement getNewcustbtn() {
	return newcustbtn;
}

public WebElement getCustname() {
	return custname;
}

public WebElement getCustdesp() {
	return custdesp;
}

public WebElement getCreatebtn() {
	return createbtn;
}

	

	
	

}
