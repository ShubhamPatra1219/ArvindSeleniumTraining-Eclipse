package testNG;

import org.testng.SkipException;
import org.testng.annotations.*;

public class TestNG_Test_Param {
	boolean product = true;
	@Test(priority = 1)
	public void searchProduct() {
		if(product==false)
			throw new SkipException("Skipping Rest Test Cases");
		   //Assert.fail("Fail");
		//System.out.println("Search Product");
	}

	@Test(dependsOnMethods = "searchProduct")
	public void plp() {
		System.out.println("Product Listing Page");
	}

	@Test(dependsOnMethods = "plp")
	public void pdp() {
		System.out.println("Product Discription Page");
	}
}