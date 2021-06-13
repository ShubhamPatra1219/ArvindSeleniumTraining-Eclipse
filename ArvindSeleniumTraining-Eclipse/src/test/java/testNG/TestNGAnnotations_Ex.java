package testNG;

import org.testng.annotations.*;

public class TestNGAnnotations_Ex {
	
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
	@Test (priority = 1)
	public void openURL() {
		System.out.println("Opening URL");
	}
	
	@Test(priority = 3)
	public void searchProduct() {
		System.out.println("Search Product");
	}
	
	@Test(priority = 4)
	public void plp() {
		System.out.println("Product Listing Page");
	}

	@Test(priority = 5)
	public void pdp() {
		System.out.println("Product Discription Page");
	}
	
	@Test(priority = 2)
	public void login() {
		System.out.println("Login");
	}

	@Test(priority = 6)
	public void addToCart() {
		System.out.println("Add To Cart");
	}

	@Test(priority = 7)
	public void addAddress() {
		System.out.println("Add Address");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("*****BEFORE METHOD*****");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("<<<<<AFTER METHOD>>>>>");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("%%%%-BEFORE CLASS-%%%%");
	}
}
