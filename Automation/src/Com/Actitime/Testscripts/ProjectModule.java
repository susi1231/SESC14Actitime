package Com.Actitime.Testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test(groups = { "smoketest","regressiontest"})
public void createCustomer()
{
	Reporter.log("CreateCustomerProjectModule",true);
	}
	@Test(groups = "regressiontest")
public void deleteCustomer() {
	Reporter.log("DeleteCustomer",true);
}
}