package CS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CS.base.TestbaseS2;

public class Scenario2Women extends TestbaseS2 {

	// web elements

	@FindBy(name = "username")
	WebElement uname;
	@FindBy(name = "password")
	WebElement upass;
	@FindBy(className = "signin")
	WebElement signin;
	@FindBy(xpath = "(//button[contains(@class,'btn btn-secondary')])[1]")
	WebElement createclick;
	@FindBy(xpath = "(//span[@class='ms-1'])[1]")
	WebElement physicalclick;

	@FindBy(id = "name")
	WebElement entername;
	@FindBy(xpath = "(//div[contains(@class,'ck ck-content')])[1]")
	WebElement enterpara;
	@FindBy(xpath = "(//label[normalize-space(text())='Sports Wear']/following::input)[1]")
	WebElement clickmen;
	@FindBy(xpath = "//label[normalize-space(text())='Men Top Wear']")
	WebElement clickMTW;
	@FindBy(xpath = "(//label[normalize-space(text())='Formal & Casual shirt']/following::input)[1]")
	WebElement clickMTS;
	@FindBy(id = "sku")
	WebElement enterSKU;
	@FindBy(name = "price")
	WebElement enterprice;
	@FindBy(name = "sale_price")
	WebElement enterdiscountprice;
	@FindBy(name = "weight")
	WebElement weight;
	@FindBy(name = "length")
	WebElement length;
	@FindBy(name = "wide")
	WebElement wide;
	@FindBy(name = "height")
	WebElement height;
	@FindBy(id = "product_collections[]-item-2")
	WebElement clickbestseller;
	@FindBy(id = "product_labels[]-item-2")
	WebElement clicknew;
	@FindBy(xpath = "(//button[@name='submit'])[3]")
	WebElement clicksave;

	// page factory initlization

	public Scenario2Women() {
		PageFactory.initElements(driver, this);

	}

	// methods

	public void Scenario2Women(String user, String pass) throws InterruptedException {
		uname.sendKeys(user);
		upass.sendKeys(pass);
		signin.click();
		js.executeScript("window.location='https://crazystylezs.com/admin/ecommerce/products'");
		createclick.click();
		physicalclick.click();
		entername.sendKeys("Branded men T-Shirt");
		enterpara.sendKeys("Fibre Identification/\r\n" + "Composition\r\n" + " Except Neck\r\n" + "For Neck\r\n"
				+ "(On Dry mass basis)");

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);

		WebElement checkbox = clickmen;
		js.executeScript("arguments[0].scrollIntoView(true);", checkbox);
		checkbox.click();
		Thread.sleep(2000);
		clickMTW.click();
		clickMTS.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(600,930)");
		enterSKU.sendKeys("SKU908");
		enterprice.sendKeys("350");
		enterdiscountprice.sendKeys("300");
		js.executeScript("window.scrollBy(930,935)");
		weight.sendKeys("150");
		length.sendKeys("150");
		wide.sendKeys("23.5");
		height.sendKeys("40");
		Thread.sleep(2000);
		clickbestseller.click();
		clicknew.click();
		clicksave.click();

	}

}
