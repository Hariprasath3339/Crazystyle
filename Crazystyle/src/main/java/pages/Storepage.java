package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.Baseclass;

public class Storepage extends Baseclass {

	public Storepage(WebDriver driver) {
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
	@FindBy(xpath = "//li[@id='cms-plugins-ecommerce']/following-sibling::li[1]")
	WebElement clickmarketplace;
	@FindBy(xpath = "//span[normalize-space(text())='Create']")
	WebElement clickcreate;
	@FindBy(css = "input[placeholder='Name']")
	WebElement entername;
	@FindBy(css = "input[placeholder='Company']")
	WebElement enterCompany;
	@FindBy(xpath = "//span[@role='textbox']")
	WebElement ClickCountrydrp;
	@FindBy(xpath = "//li[normalize-space(text())='India']")
	WebElement ClickIndia;
	@FindBy(css = "input[placeholder='State']")
	WebElement enterState;
	@FindBy(xpath = "//input[@placeholder='City']")
	WebElement enterCity;
	@FindBy(xpath = "//input[@placeholder='Address']")
	WebElement enterAddress;
	@FindBy(xpath = "//input[@placeholder='Zip Code']")
	WebElement enterZipcode;
	@FindBy(xpath = "//input[@placeholder='Ex: name@store.com']")
	WebElement entermail;
	@FindBy(xpath = "//input[@placeholder='Phone']")
	WebElement enterphn;
	@FindBy(xpath = "(//textarea[@name='description'])[1]")
	WebElement enterdescription;
	@FindBy(xpath = "//div[contains(@class,'ck ck-content')]")
	WebElement entercontent;
	@FindBy(xpath = "//a[@data-action='select-image']")
	WebElement clickimage;

	// Methods

	public void Adminlogin1(String user, String pass) throws InterruptedException {
		uname.sendKeys(user);
		upass.sendKeys(pass);
		clicklogin.click();
		Thread.sleep(2000);
	}

	public void Clickpopup() throws InterruptedException {

		clickpop1.click();
		Thread.sleep(2000);
		clickpop2.click();

	}

	public void Clickandnavigate() throws InterruptedException {
		Thread.sleep(2000);
		clickmarketplace.click();

		WebElement wb = driver.findElement(By.xpath("//li[@id='cms-plugins-store']//a[1]"));
		js.executeScript("arguments[0].scrollIntoView(true);", wb);
		js.executeScript("arguments[0].click();", wb);
		clickcreate.click();
	}

	public void Storedetails() throws InterruptedException {
		entername.sendKeys("ABC");
		enterCompany.sendKeys("ABCCOMPANY");
		ClickCountrydrp.click();
		Thread.sleep(2000);
		WebElement wb = driver.findElement(By.xpath("//li[normalize-space(text())='India']"));
		js.executeScript("arguments[0].scrollIntoView(true);", wb);
		js.executeScript("arguments[0].click();", wb);
		ClickIndia.click();
		enterState.sendKeys("Tamilnadu");
		enterCity.sendKeys("Coimbatore");
		enterAddress.sendKeys("1/95,padhuvampalli(post),sulur(Taluk),karumathampatti(Road),coimbatore");
		enterZipcode.sendKeys("641659");
		entermail.sendKeys("hariprasathnagarajan35@gmail.com");
		enterphn.sendKeys("7092883339");
		enterdescription.sendKeys("xxxxxxxxxx");

		WebElement wb1 = driver.findElement(By.xpath("//div[contains(@class,'ck ck-content')]"));
		js.executeScript("arguments[0].scrollIntoView(true);", wb1);
		js.executeScript("arguments[0].click();", wb1);
		entercontent.sendKeys("xxxxxxx");
		clickimage.click();
	}

}
