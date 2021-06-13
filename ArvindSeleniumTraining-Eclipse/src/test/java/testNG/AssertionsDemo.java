package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo extends BaseTest{
	
//	//@Test
//	public void hardAssertion()
//	{
//		System.out.println("Starting...");
//		int i=10;
//		Assert.assertEquals(i, 200,"Mismatch");
//		System.out.println("Ending");
//	}
//	
//	//@Test
//	public void demoHardAssertion()
//	{
//		System.out.println("Starting...");
//        driver.get("https://www.google.com");
//		String actualTitle = driver.getTitle();
//		Assert.assertEquals(actualTitle,"Facebook","Mismatch");
//		System.out.println("Ending");
//	}
//	
//	//@Test
//	public void softAssertion()
//	{
//		System.out.println("Starting...");
//		int i=10;
//		SoftAssert sf = new SoftAssert();
//		sf.assertEquals(i, 200,"Mismatch");
//		Assert.assertEquals(i, 100,"Mismatch");
//		System.out.println("Ending");
//	}
	
	@Test
	public void SoftAssertionDemo()
	{
		System.out.println("Starting...");
		SoftAssert sf = new SoftAssert();
        driver.get("https://www.google.com");
		String actualTitle = driver.getTitle();
		sf.assertEquals(actualTitle,"Facebook","Mismatch");
		System.out.println("Ending");
		sf.assertAll();
	}
	
	@Test
	public void demo()
	{
		System.out.println("JUST DEMO");
	}


}
