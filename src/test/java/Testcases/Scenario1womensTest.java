package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CS.base.Testbase;
import CS.pages.Scenario1womens;

public class Scenario1womensTest extends Testbase {

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

		objlog.enteruname(prop.getProperty("Username"), prop.getProperty("Password"));
	}

}
