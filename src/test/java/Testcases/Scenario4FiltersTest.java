package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CS.base.TestbaseS1;

public class Scenario4FiltersTest extends TestbaseS1 {

	CS.pages.Scenario4Filters objlog;

	public Scenario4FiltersTest() {
		super();
	}

	@BeforeMethod
	public void beforeMethod() {
		initilization();
		objlog = new CS.pages.Scenario4Filters();

	}

	@AfterMethod
	public void afterMethod() {
	//	driver.close();
	}

	@Test
	public void Scenario4Filters() throws InterruptedException {

		objlog.Scenario3(prop.getProperty("Username"), prop.getProperty("Password"));
	}

}
