package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CS.base.TestbaseS1;
import CS.pages.Scenario1MenAccessories;
import CS.pages.Scenario1mens;
import CS.pages.Scenario1womenAccessories;

public class Scenario1WomenAccessoriesTest extends TestbaseS1 {

	Scenario1womenAccessories objlog;

	public Scenario1WomenAccessoriesTest() {
		super();
	}

	@BeforeMethod
	public void beforeMethod() {
		initilization();
		objlog = new Scenario1womenAccessories();

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	@Test
	public void Scenario1womenAccessories() throws InterruptedException {

		objlog.enteruname(prop.getProperty("Username"), prop.getProperty("Password"));
	}

}
