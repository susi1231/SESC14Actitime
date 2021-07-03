package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment {
    
	@Test(priority = 1,invocationCount = 2)
	public void editCustomer()
	{
	Reporter.log("editcustomer",true);	
	}
	
	@Test
	public void registerCustomer()
	{
		Reporter.log("registerCustomer",true);
	}
	
	@Test
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer",true);
	}
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logoutCustomer()
	{
		Reporter.log("logoutCustomer",true);
	}
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("openBrowser",true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("openBrowser",true);
	}
	
}
