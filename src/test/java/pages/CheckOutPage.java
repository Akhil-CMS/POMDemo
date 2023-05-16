package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckOutPage extends TestBase{
	@FindBy(xpath="//*[@id=\"s-name\"]")
	WebElement nametb;
	
	@FindBy(xpath = "//input[@id='s-surname']")
	WebElement sunametb;
	
	@FindBy(xpath = "//input[@id='s-address']")
	WebElement addresstb;
	
	@FindBy(xpath = "//input[@id='s-zipcode']")
	WebElement ziptb;
	
	@FindBy(xpath = "//input[@id='s-city']")
	WebElement citytb;
	
	@FindBy(xpath = "//input[@id='s-company']")
	WebElement companytb;
	
	@FindBy(xpath = "//input[@id='asap']")
	WebElement radbtn;
	
	/*@FindBy(xpath = "//input[@id='billing-different']")
	WebElement chkbox;*/
	
	@FindBy(xpath = "//button[contains(text(),'Buy')]")
	WebElement buybtn;
	
	
	
	
	
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void nameItem(String namItem) {
		nametb.sendKeys(namItem);
	}
	
	public void surnameItem(String surnamItem) {
		sunametb.sendKeys(surnamItem);
	}
	
	public void addrItem(String adrItem) {
		addresstb.sendKeys(adrItem);
	}
	public void zipcItem(String zipItem) {
		ziptb.sendKeys(zipItem);
	}
	public void cityItem(String ctyItem) {
		citytb.sendKeys(ctyItem);
	}
	public void companyItem(String comItem) {
		companytb.sendKeys(comItem);
		radbtn.click();
		//chkbox.click();
		buybtn.click();
	}

}
