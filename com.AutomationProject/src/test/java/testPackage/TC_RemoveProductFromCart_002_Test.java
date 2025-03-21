package testPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseTest;
import pomPackage.ElectronicsPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;

public class TC_RemoveProductFromCart_002_Test extends BaseTest {
  @Test
  public void removeProductFromCart() 
  {
	  WelcomePage wp = new WelcomePage(driver);
      wp.getElectronicslink().click();
      
      ElectronicsPage ep = new ElectronicsPage(driver);
      ep.getCellPhoneLink().click();
      
      ep.getSmartPhoneAddToCartButton().click();
    
     wp.getShoppingcartlink().click();
     
   ShoppingCartPage sp = new ShoppingCartPage(driver);
   sp.getSmartphoneCheckbox().click();
   
   sp.getUpdateShoppingCartButton().click();
   
   SoftAssert sa = new SoftAssert();
   try {
	   sa.assertEquals(sp.getSmartphoneCartProduct().isDisplayed(),false, "product is not removed from cart");
   }
   catch(Exception e)
{
	   Reporter.log("product is removed from cart", true);
	   }
   sa.assertAll();
   
   
	  
  }
}
