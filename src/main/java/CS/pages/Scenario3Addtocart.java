package CS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import CS.base.TestbaseS1;

public class Scenario3Addtocart extends TestbaseS1 {

	// web elements
	@FindBy(linkText = "Account")
	WebElement clickaccount;
	@FindBy(id = "txt-email")
	WebElement uname;
	@FindBy(id = "txt-password")
	WebElement upass;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement signin;
	@FindBy(xpath = "(//i[@class='fi-rs-shopping-cart mr-5']/following-sibling::span)[2]")
	WebElement addtocart;
	@FindBy(xpath = "//span[@class='pro-count blue']")
	WebElement moveaddtocart;
	@FindBy(xpath = "//a[@class='mini-cart-icon']/following-sibling::a[1]")
	WebElement clickaddtocart;
	@FindBy(name = "checkout")
	WebElement clickproceedtocheckout;
	@FindBy(id = "address_id")
	WebElement clickaddress;
	@FindBy(id = "address_name")
	WebElement entername;
	@FindBy(id = "address_email")
	WebElement enteremail;
	@FindBy(id = "address_phone")
	WebElement enterphn;
	@FindBy(id = "address_city")
	WebElement entercity;
	@FindBy(id = "address_address")
	WebElement enteraddress;
	@FindBy(id = "address_zip_code")
	WebElement enterzipcode;
	@FindBy(id = "description")
	WebElement enterdescription;
	@FindBy(css = "button[type='submit']")
	WebElement clickcheckout;
	@FindBy(css = "input[name='success']")
	WebElement clicksuccesspayment;

	@FindBy(xpath = "//p[text()='You have successfully completed your payment, thank you.']/following-sibling::a")
	WebElement close;

	// page factory initlization

	public Scenario3Addtocart() {
		PageFactory.initElements(driver, this);
	}

	// methods

	public void Scenario3(String user, String pass) throws InterruptedException {
		clickaccount.click();
		js.executeScript("window.scrollBy(0,250)");
		uname.sendKeys(user);
		upass.sendKeys(pass);
		signin.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1300)");
		Thread.sleep(2000);
		addtocart.click();
		Thread.sleep(2000);
		WebElement checkbox = moveaddtocart;
		js.executeScript("arguments[0].scrollIntoView(true);", checkbox);
		Thread.sleep(2000);
		clickaddtocart.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		clickproceedtocheckout.click();
		Thread.sleep(2000);
		clickaddress.click();
		Thread.sleep(2000);
		WebElement address = clickaddress;
		Select sdrp = new Select(address);
		sdrp.selectByIndex(0);
		Thread.sleep(2000);
		entername.clear();
		entername.sendKeys("Sarath");
		Thread.sleep(2000);
		enteremail.clear();
		enteremail.sendKeys("sarathrasa@gmail.com");
		Thread.sleep(2000);
		enterphn.clear();
		enterphn.sendKeys("7098254780");
		Thread.sleep(2000);
		entercity.clear();
		entercity.sendKeys("thirupur");
		Thread.sleep(2000);
		enteraddress.clear();
		enteraddress.sendKeys("1/999,kinathukadavu,avinashi");
		Thread.sleep(2000);
		enterzipcode.clear();
		enterzipcode.sendKeys("641652");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		enterdescription.sendKeys("The payment is going to done for sarath");
		clickcheckout.click();
		clicksuccesspayment.click();
		close.click();

	}

}
