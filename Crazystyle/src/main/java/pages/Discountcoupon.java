package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.Baseclass;

public class Discountcoupon extends Baseclass {

	public Discountcoupon(WebDriver driver) {
		super(driver);

	}
	// Web Element

	@FindBy(name = "username")
	WebElement uname;
	@FindBy(name = "password")
	WebElement upass;
	@FindBy(css = "span.signin")
	WebElement clicklogin;
	@FindBy(xpath = "(//button[@aria-hidden='true'])[3]")
	WebElement clickpop1;
	@FindBy(xpath = "/html/body/div[9]/div/div/button")
	WebElement clickpop2;
	@FindBy(id = "cms-plugins-ecommerce")
	WebElement ClickEcom;
	@FindBy(xpath = "//span[@data-action='create']")
	WebElement clickcreate;
	@FindBy(xpath = "//a[@class='btn-change-link float-end']")
	WebElement Generatecode;
	@FindBy(xpath = "//input[@class='next-input next-input--invisible']")
	WebElement enterdiscount;
	@FindBy(xpath = "(//input[@class='hrv-checkbox'])[3]")
	WebElement untickcheckbox;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Clicksave;
	@FindBy(xpath = "(//span[normalize-space(text())='Create coupon code']/following::input)[1]")
	WebElement Entercode;
	@FindBy(xpath = "//span[normalize-space(text())='View website']")
	WebElement Clickwebsite;
	@FindBy(xpath = "//span[@class='lable ml-0']")
	WebElement clickaccount;
	@FindBy(id = "txt-email")
	WebElement uname1;
	@FindBy(id = "txt-password")
	WebElement upass1;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement signin;
	@FindBy(id = "description")
	WebElement enterorder;

	public void Adminlogin(String user, String pass) throws InterruptedException {
		uname.sendKeys(user);
		upass.sendKeys(pass);
		clicklogin.click();
		Thread.sleep(2000);
	}

	public void Clickpopup1and2() throws InterruptedException {
		clickpop1.click();
		Thread.sleep(2000);
		clickpop2.click();

	}

	public void ClickEcomanddiscount() throws InterruptedException {
		ClickEcom.click();
		WebElement wb = driver.findElement(By.xpath("//a[normalize-space(text())='Discounts']"));
		js.executeScript("arguments[0].scrollIntoView(true);", wb);
		js.executeScript("arguments[0].click();", wb);
	}

	public void clickcreate() {
		clickcreate.click();
	}

	public void Generatecode() throws InterruptedException {
		Entercode.sendKeys("LEO10");
		// Generatecode.click();
		enterdiscount.sendKeys("150");
		Clicksave.click();

	}

	public void Websitelogin() throws InterruptedException {
		String originalWindow = driver.getWindowHandle();
		Clickwebsite.click();
		Set<String> allWindows = driver.getWindowHandles();

		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(originalWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		clickaccount.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(2000);
		uname1.sendKeys("hariprasathnagarajan35@gmail.com");
		upass1.sendKeys("H@ri$uba3");
		signin.click();
	}

	public void applycoupon() throws InterruptedException {

		WebElement clickdress = driver.findElement(By.xpath("//a[normalize-space(text())='Floral Cotton Maxi Dress']"));
		js.executeScript("arguments[0].scrollIntoView(true);", clickdress);
		js.executeScript("arguments[0].click();", clickdress);
		Thread.sleep(2000);

		WebElement addtocart = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(true);", addtocart);
		js.executeScript("arguments[0].click();", addtocart);
		Thread.sleep(2000);

		WebElement clickthecart = driver.findElement(By.xpath("//a[@class='mini-cart-icon']/following-sibling::a[1]"));
		js.executeScript("arguments[0].scrollIntoView(true);", clickthecart);
		js.executeScript("arguments[0].click();", clickthecart);
		Thread.sleep(2000);

		WebElement clickthecoupocode = driver.findElement(By.xpath("//input[contains(@class,'font-medium mr-15')]"));
		js.executeScript("arguments[0].scrollIntoView(true);", clickthecoupocode);
		js.executeScript("arguments[0].click();", clickthecoupocode);
		clickthecoupocode.sendKeys("LEO10");
		Thread.sleep(2000);

		WebElement Clickcode = driver.findElement(By.xpath("//button[@class='btn btn-apply-coupon-code']"));
		js.executeScript("arguments[0].scrollIntoView(true);", Clickcode);
		js.executeScript("arguments[0].click();", Clickcode);
		Thread.sleep(2000);

		WebElement Clicktoproceed = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(true);", Clicktoproceed);
		js.executeScript("arguments[0].click();", Clicktoproceed);

	}

	public void shipment() throws InterruptedException {
		Thread.sleep(2000);
		WebElement clickcheckout = driver
				.findElement(By.xpath("//button[contains(@class,'btn payment-checkout-btn')]"));
		js.executeScript("arguments[0].scrollIntoView(true);", clickcheckout);
		js.executeScript("arguments[0].click();", clickcheckout);

	}

}
