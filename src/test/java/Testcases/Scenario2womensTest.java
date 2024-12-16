package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CS.base.TestbaseS2;
import CS.pages.Scenario2Women;

public class Scenario2womensTest extends TestbaseS2 {

	Scenario2Women objlog;

	public Scenario2womensTest() {
		super();
	}

	@BeforeMethod
	public void beforeMethod() {
		initilization();
		objlog = new Scenario2Women();

	}

	@AfterMethod
	public void afterMethod() {
		 driver.close();
	}

	@Test
	public void Scenario2womens() throws InterruptedException {

		objlog.Scenario2Women(prop.getProperty("Username"), prop.getProperty("Password"));
	}

}
