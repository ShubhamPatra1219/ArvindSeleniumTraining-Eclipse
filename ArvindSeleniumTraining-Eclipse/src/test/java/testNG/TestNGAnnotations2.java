package testNG;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

//@Listeners(MyReports.class)
public class TestNGAnnotations2 extends BaseTest{

	@Test(priority = 1)
	public void openURL() throws InterruptedException {
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		System.out.println(driver.getCurrentUrl());
		Reporter.log("User is on "+driver.getCurrentUrl());
        Reporter.log("Page Title is "+driver.getTitle());
		//Reporter.log("Page Source"+driver.getPageSource());
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
		Assert.fail("Fail");
		System.out.println("Product Discription Page");
	}

}
