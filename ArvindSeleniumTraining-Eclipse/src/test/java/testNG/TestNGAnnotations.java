package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.*;

//@Listeners(MyReports.class)
public class TestNGAnnotations extends BaseTest {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("====Before Method====");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("****After Method****");
	}
	@Test(priority = 1)
	public void openURL() {
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		System.out.println(driver.getCurrentUrl());
		Reporter.log("User is on "+driver.getCurrentUrl());
		Reporter.log("Page Title is "+driver.getTitle());
		//Reporter.log("Page Source"+driver.getPageSource());
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

	@Test(priority = 8)
	public void paymentGateway() {
		System.out.println("Payment Gateway");
	}

	@AfterTest
	public void logOut() {
		System.out.println("Log Out");
	}
}
