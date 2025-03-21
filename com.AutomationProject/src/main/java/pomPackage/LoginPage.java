package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Declaration
	@FindBy(id="Email")private WebElement emailTB;
	@FindBy(id="Password")private WebElement passwordTB;
	@FindBy(xpath="//input[@value='Log in']") private WebElement loginbutton;
	@FindBy(id="RemeberMe")private WebElement remembermecheckbox;
	@FindBy(linkText="Forgot password") private WebElement forgotpasswordlink;
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization

	public WebElement getEmailTB() {
		return emailTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}


	public WebElement getLoginbutton() {
		return loginbutton;
	}


	public WebElement getRemembermecheckbox() {
		return remembermecheckbox;
	}

	public WebElement getForgotpasswordlink() {
		return forgotpasswordlink;
	}

   //operational methods/business logic
	
	public void validLoginMethod(String email,String password)
	{
		emailTB.sendKeys(email);
		passwordTB.sendKeys(password);
		loginbutton.click();
	}
	
	public void invalidLoginMethod(String email, String password)throws InterruptedException
	{
		emailTB.sendKeys(email);
		passwordTB.sendKeys(password);
		Thread.sleep(1000);
		emailTB.clear();
		passwordTB.clear();
	}
	
}
