package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CS.base.TestbaseS1;
import CS.pages.Scenario1womens;

public class Scenario1womensTest extends TestbaseS1 {

	Scenario1womens objlog;

	public Scenario1womensTest() {
		super();
	}

	@BeforeMethod
	public void beforeMethod() {
		initilization();
		objlog = new Scenario1womens();

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	@Test
	public void Scenario1womens() throws InterruptedException {

		objlog.Scenario1womens(prop.getProperty("Username"), prop.getProperty("Password"));
	}

}
