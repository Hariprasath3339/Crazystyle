package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.Baseclass;

public class Login extends Baseclass {
	WebDriver driver;

	public Login(WebDriver driver) {
		super(driver);

	}

	//Web elements
	
	@FindBy(linkText = "Account")
	WebElement clickaccount;
	@FindBy(id = "txt-email")
	WebElement uname;
	@FindBy(id = "txt-password")
	WebElement upass;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement signin;

	
	
	
	public void login(String username, String userpass) {
		clickaccount.click();
		js.executeScript("window.scrollBy(0,250)");
		uname.sendKeys(username);
		upass.sendKeys(userpass);
		signin.click();
	}

	public void login1() {
		clickaccount.click();

	}

}
