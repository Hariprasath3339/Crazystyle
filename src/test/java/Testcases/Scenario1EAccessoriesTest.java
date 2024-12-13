package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CS.base.Testbase;
import CS.pages.Scenario1EAccessories;
import CS.pages.Scenario1MenAccessories;
import CS.pages.Scenario1mens;

public class Scenario1EAccessoriesTest extends Testbase {

	Scenario1EAccessories objlog;

	public Scenario1EAccessoriesTest() {
		super();
	}

	@BeforeMethod
	public void beforeMethod() {
		initilization();
		objlog = new Scenario1EAccessories();

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	@Test
	public void Scenario1EAccessories() throws InterruptedException {

		objlog.enteruname(prop.getProperty("Username"), prop.getProperty("Password"));
	}

}
