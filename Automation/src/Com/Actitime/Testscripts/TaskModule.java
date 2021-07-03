package Com.Actitime.Testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule {

	@Test(groups = { "smoketest","regressiontest"})
	public void createTaskModule() {
		Reporter.log("createCustomerTaskModule",true);
	}
	@Test(groups = "regressiontest")
	public void deleteTaskModule() {
		Reporter.log("delete customer",true);
	}
	}


