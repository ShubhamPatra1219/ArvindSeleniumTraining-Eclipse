package testNG;

import org.testng.annotations.*;

public class TestNGAnnotations3 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("++++BEFORE SUITE START REPORTING++++");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("++++AFTER SUITE SEND EMAIL++++");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("$$$$-AFTER CLASS-$$$$");
	}

	@BeforeTest
	public void openBrowser() {
		System.out.println("====Before-Test====");
	}

	@AfterTest
	public void logOut() {
		System.out.println("####After-Test####");
	}

	@Test(priority = 1, groups = "DEMO GROUPS")
	public void test1() {
		System.out.println("Test1");

	}

	@Test(priority = 2, groups = "DEMO GROUPS")
	public void test2() {
		System.out.println("Test2");

	}

	@Test(priority = 3, groups = "SEARCH GROUPS")
	public void test3() {
		System.out.println("Test3");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("*****BEFORE METHOD*****");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("<<<<<AFTER METHOD>>>>>");
	}

	@BeforeGroups("DEMO GROUPS")
	public void demoGroup() {
		System.out.println("+++++BEFORE GROUP+++++");
	}

	@AfterGroups("DEMO GROUPS")
	public void afterGroup() {
		System.out.println("$$$$$AFTER GROUP$$$$$");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("%%%%-BEFORE CLASS-%%%%");
	}
}
