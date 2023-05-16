package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SearchResultPage extends TestBase{
	
	@FindBy(css = "li.preview")
	WebElement itemIcon;
	
	@FindBy(css = "div.detail button.call-to-action")
	WebElement addBtn;
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	//view details
	public void viewItemDetails() {
		itemIcon.click();
	}
	
	
	public void addToCart() {
		addBtn.click();
	}

}
