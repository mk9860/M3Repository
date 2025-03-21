package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	//Declaration
	@FindBy(linkText = "Register") private WebElement registerlink;
	@FindBy(linkText = "Log in") private WebElement loginlink;
	@FindBy(xpath = "//span[text()='Shopping cart']") private WebElement shoppingcartlink;
	@FindBy(xpath = "//span[text()='Wishlist']") private WebElement wishlistlink;
	@FindBy(partialLinkText = "BOOKS")private WebElement bookslink;
	@FindBy(partialLinkText = "COMPUTERS")private WebElement computerslink;
	@FindBy(partialLinkText = "ELECTRONICS")private WebElement electronicslink;
    //@FindBy(partialLinkText = "APPAREL&SHOES")private WebElement apparelshoeslink;
    @FindBy(linkText = "Log out")private WebElement logoutlink;

   //Initialization

  public WelcomePage(WebDriver driver)
 {
	PageFactory.initElements(driver,this);
 }

  //Utilization
public WebElement getRegisterlink() {
	return registerlink;
}


public WebElement getLoginlink() {
	return loginlink;
}




public WebElement getShoppingcartlink() {
	return shoppingcartlink;
}


public WebElement getWishlistlink() {
	return wishlistlink;
}


public WebElement getBookslink() {
	return bookslink;
}


public WebElement getComputerslink() {
	return computerslink;
}


public WebElement getElectronicslink() {
	return electronicslink;
}
  
public WebElement getlogoutlink() {
	return logoutlink;
}


  public void logout()
  {
	  logoutlink.click();
  }
}