package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {

	//Pagefactory
	
		@FindBy(name="searchbar")
		WebElement srcbox;
		
		@FindBy(id="button-search")
		WebElement srcBtn;
		
		@FindBy(id="cart")
		WebElement cartBtn;
		
		
		public HomePage() {
		PageFactory.initElements(driver, this);
		
		}
		//Actions
		//login
		//signup
		//searchItem
		
		public void searchItem(String srtItem) {
			srcbox.sendKeys(srtItem);
			srcBtn.click();
		}
		
		//viewShoppingCart
}
