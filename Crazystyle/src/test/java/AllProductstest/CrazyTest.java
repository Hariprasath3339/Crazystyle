package AllProductstest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Discountcoupon;
import pages.Login;
import pages.Mousehover;

public class CrazyTest {

	public WebDriver driver;

	@Test(enabled = false)
	public void login() {
		Login lg = new Login(driver);
		lg.login("hariprasathnagarajan35@gmail.com", "H@ri$uba3");

	}

	@Test(enabled = false)

	public void mousehover() {
		Mousehover MH = new Mousehover(driver);
		MH.mousehoverwomens();
	}

	@Test(priority = 0)

	public void discountcoupon() throws InterruptedException {
		Discountcoupon ds = new Discountcoupon(driver);
		ds.Adminlogin("botble", "159357");
		ds.Clickpopup1and2();
		ds.ClickEcomanddiscount();
		ds.clickcreate();
		ds.Generatecode();
		ds.Websitelogin();
		ds.applycoupon();
	}

	@BeforeClass
	public void beforeClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://crazystylezs.com/admin");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
