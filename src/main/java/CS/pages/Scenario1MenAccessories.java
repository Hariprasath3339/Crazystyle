package CS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CS.base.Testbase;

public class Scenario1MenAccessories extends Testbase {

	// web elements
	@FindBy(linkText = "Account")
	WebElement clickaccount;
	@FindBy(id = "txt-email")
	WebElement uname;
	@FindBy(id = "txt-password")
	WebElement upass;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement signin;
	@FindBy(css = "button[name='checkout']")
	WebElement clickbuynow;
	@FindBy(css = "button[type='submit']")
	WebElement clickproceedpayment;
	@FindBy(css = "input[name='success']")
	WebElement clicksuccesspayment;

	@FindBy(xpath = "//p[text()='You have successfully completed your payment, thank you.']/following-sibling::a")
	WebElement close;

	// page factory initlization

	public Scenario1MenAccessories() {
		PageFactory.initElements(driver, this);
	}

	// methods

	public void enteruname(String user, String pass) throws InterruptedException {
		clickaccount.click();
		js.executeScript("window.scrollBy(0,250)");
		uname.sendKeys(user);
		upass.sendKeys(pass);
		signin.click();
		js.executeScript("window.location='https://crazystylezs.com/product-categories/belts'");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("window.location='https://crazystylezs.com/products/off-white-fabric-belt'");

		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);

		clickbuynow.click();
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,300)");
		clickproceedpayment.click();
		clicksuccesspayment.click();
		close.click();
	}

}