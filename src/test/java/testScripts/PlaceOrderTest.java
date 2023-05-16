package testScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CheckOutPage;
import pages.HomePage;
import pages.SearchResultPage;
import pages.ShoppingCart;

public class PlaceOrderTest extends TestBase {
	
	HomePage homePage;
	SearchResultPage resPage;
	ShoppingCart ShopCartTest;
	CheckOutPage chkoutPage;
	
	
  @BeforeTest
  public void setup() {
	initialize();  
  }
  @Test
  public void addItemTest() {
	//searchItem
	//addItemtocart
	  
	  homePage = new HomePage();
	  homePage.searchItem("Parry Hotter");
	  
	  resPage = new SearchResultPage();
	  resPage.viewItemDetails();
	  resPage.addToCart();
	  
	  
  }	
  @Test
  public void clickCheckOut() throws InterruptedException {
	  
	  ShopCartTest = new ShoppingCart();
	  ShopCartTest.clickCheckOut();
	  //ShopCartTest.clickemptycart();
	 chkoutPage = new CheckOutPage();
	  chkoutPage.nameItem("Akhil");
	  chkoutPage.surnameItem("Balu");
	  chkoutPage.addrItem("NRI Layout");
	  chkoutPage.zipcItem("560034");
	  chkoutPage.cityItem("Bengaluru");
	  chkoutPage.companyItem("Test Firm");
}
   
}

