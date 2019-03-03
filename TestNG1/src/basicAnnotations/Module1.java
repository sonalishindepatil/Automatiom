package basicAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Module1 {
	
	@BeforeClass   //executes before all test case or module
	public void beforeModule()
	{
	System.out.println("Before Module1");	
	}
	
	@AfterClass    //executes after all test cases or module
	public void AfterModule()
	{
	System.out.println("After Module1");	
	}
	
	@BeforeMethod  //pre condition not a test case executes before each test case
	public void beforeTestScript()
	{
		System.out.println("Before Test Script1");
	}
	
	@AfterMethod    //post condition not a test case executes after eachtest case
	public void afterTestScript()
	{
		System.out.println("After Test Script1");
	}
	
	@Test //test 1
	void test1()
	{
		System.out.println("Login test case1");
	}
	@Test   //test2
	public void test2()
	{
		System.out.println("Logout test case1");
	}

}
