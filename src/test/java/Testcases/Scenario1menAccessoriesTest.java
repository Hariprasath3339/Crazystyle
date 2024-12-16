package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CS.base.TestbaseS1;
import CS.pages.Scenario1MenAccessories;
import CS.pages.Scenario1mens;

public class Scenario1menAccessoriesTest extends TestbaseS1 {

	Scenario1MenAccessories objlog;

	public Scenario1menAccessoriesTest() {
		super();
	}

	@BeforeMethod
	public void beforeMethod() {
		initilization();
		objlog = new Scenario1MenAccessories();

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	@Test
	public void Scenario1MenAccessories() throws InterruptedException {

		objlog.enteruname(prop.getProperty("Username"), prop.getProperty("Password"));
	}

}
