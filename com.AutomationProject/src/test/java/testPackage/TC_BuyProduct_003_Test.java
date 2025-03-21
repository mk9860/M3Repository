package testPackage;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomPackage.ElectronicsPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;

public class TC_BuyProduct_003_Test extends BaseTest {
  @Test
  public void buyProductMethod() 
  {
	 WelcomePage wp = new WelcomePage(driver);
	 wp.getElectronicslink().click();
	 
	 ElectronicsPage ep = new ElectronicsPage(driver);
	 ep.getCellPhoneLink().click();
	 
	 ep.getSmartPhoneAddToCartButton().click();
	 wp.getShoppingcartlink().click();
	 
	 ShoppingCartPage sp = new ShoppingCartPage(driver);
	 sp.getSmartphoneCheckbox().click();
	 
	 sp.getTermOfServiceCheckbox().click();
	 sp.getCheckoutButton().click();
  }
}
