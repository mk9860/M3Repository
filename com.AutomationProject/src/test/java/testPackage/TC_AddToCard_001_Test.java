package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseTest;
import genericLibrary.Flib;
import pomPackage.ElectronicsPage;
import pomPackage.LoginPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;

public class TC_AddToCard_001_Test extends BaseTest{

	@Test
	public void addToCartMethod() throws IOException {
	 
       WelcomePage wp = new WelcomePage(driver);
       wp.getElectronicslink().click();
       
       ElectronicsPage ep = new ElectronicsPage(driver);
       ep.getCellPhoneLink().click();
       
       ep.getSmartPhoneAddToCartButton().click();
     
      wp.getShoppingcartlink().click();
      
    ShoppingCartPage sp = new ShoppingCartPage(driver);
    
    SoftAssert sa = new SoftAssert();
    sa.assertEquals(sp.getSmartphoneCartProduct().isDisplayed(),true, "product is not added to cart");
    sa.assertAll();
   
	}

}
