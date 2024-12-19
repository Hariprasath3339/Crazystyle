package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CS.base.TestbaseS1;

public class Scenario3AddtocartTest extends TestbaseS1 {

	CS.pages.Scenario3Addtocart objlog;

	public Scenario3AddtocartTest() {
		super();
	}

	@BeforeMethod
	public void beforeMethod() {
		initilization();
		objlog = new CS.pages.Scenario3Addtocart();

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	@Test
	public void Scenario3Addtocart() throws InterruptedException {

		objlog.Scenario3(prop.getProperty("Username"), prop.getProperty("Password"));
	}

}
