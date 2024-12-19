package CS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CS.base.TestbaseS1;

public class Scenario4Filters extends TestbaseS1 {

	// web elements
	@FindBy(linkText = "Account")
	WebElement clickaccount;
	@FindBy(id = "txt-email")
	WebElement uname;
	@FindBy(id = "txt-password")
	WebElement upass;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement signin;
	@FindBy(xpath = "(//span[@class='title'])[1]")
	WebElement clickfilter1;
	@FindBy(xpath = "//label[contains(.,'H&M (34)')]")
	WebElement clickHandM;
	@FindBy(xpath = "//label[contains(.,'Levis (35)')]")
	WebElement clicklevis;
	@FindBy(xpath = "//label[contains(.,'Max (37)')]")
	WebElement clickmax;
	@FindBy(xpath = "//span[normalize-space(text())='Daniel Willington']")
	WebElement clickDanielWillington;
	@FindBy(xpath = "(//input[@name='tags[]']/following-sibling::label)[2]")
	WebElement clickmentag;
	@FindBy(xpath = "(//button[@type='submit']//i)[2]")
	WebElement clickFbtn;
	@FindBy(xpath = "(//span[@class='title'])[1]")
	WebElement clickfilter2;
	@FindBy(xpath = "//a[contains(@class,'clear_filter dib')]")
	WebElement clickclearAF;
	@FindBy(xpath = "(//span[@class='title'])[1]")
	WebElement clickfilter3;
	@FindBy(xpath = "(//span[@class='title'])[2]")
	WebElement clickadvancedFilter;
	@FindBy(xpath = "//li[@title='Yellow']//span")
	WebElement clickyellow;
	@FindBy(xpath = "(//input[@class='form-control product-filter-item']/following-sibling::span)[3]")
	WebElement clickred;
	@FindBy(xpath = "(//i[@class='fi-rs- mr-10'])[1]")
	WebElement clicksmall;
	@FindBy(xpath = "(//i[@class='fi-rs- mr-10'])[2]")
	WebElement clickmedium;
	@FindBy(xpath = "(//i[@class='fi-rs- mr-10'])[3]")
	WebElement clicklarge;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement clickfilter4;
	@FindBy(xpath = "//span[normalize-space(text())='Show:']")
	WebElement clickshow;
	@FindBy(xpath = "//a[normalize-space(text())='24']")
	WebElement click24;
	@FindBy(xpath = "(//div[@class='sort-by'])[2]")
	WebElement clicksort;
	@FindBy(xpath = "//a[normalize-space(text())='Newest']")
	WebElement clicknewest;

	// page factory initlization

	public Scenario4Filters() {
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
		js.executeScript("window.location='https://crazystylezs.com/product-categories/men-t-shirt'");
		Thread.sleep(2000);
		clickfilter1.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(2000);
		clickHandM.click();
		clicklevis.click();
		clickmax.click();
		Thread.sleep(2000);
		WebElement DW = clickDanielWillington;
		js.executeScript("arguments[0].scrollIntoView(true);", DW);
		DW.click();
		Thread.sleep(2000);
		clickmentag.click();
		clickFbtn.click();
		Thread.sleep(2000);
		clickfilter2.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(2000);
		clickclearAF.click();
		Thread.sleep(2000);
		clickfilter3.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(2000);
		clickadvancedFilter.click();
		Thread.sleep(2000);
		clickyellow.click();
		clickred.click();
		clicksmall.click();
		clickmedium.click();
		clicklarge.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(2000);
		clickfilter4.click();
		Thread.sleep(2000);
		clickshow.click();
		click24.click();
		Thread.sleep(2000);
		clicksort.click();
		Thread.sleep(2000);
		clicknewest.click();

	}

}
