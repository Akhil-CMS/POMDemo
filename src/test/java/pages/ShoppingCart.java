package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ShoppingCart extends TestBase {
	
	@FindBy(xpath = "//button[normalize-space()='Checkout']")
	WebElement checkoutBtn;
	
	@FindBy(xpath = "//button[normalize-space()='Empty Cart']")
	WebElement emtbutton;

	public ShoppingCart() {
		PageFactory.initElements(driver, this);
	}
	
	//view details
	public void clickCheckOut() throws InterruptedException {
		checkoutBtn.click();
		Thread.sleep(1000);
		//driver.navigate().back();
	}
	/*public void clickemptycart() {
		emtbutton.click();
	}*/
	}
