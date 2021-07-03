package Com.Actitime.Testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.Actitime.Generics.BaseClass;
//every class should have @Listeners
//

@Listeners(Com.Actitime.Generics.ListernersImplementation.class)
public class CustomerModule {
	
	@Test
public void testCreateCustomer() {
	Reporter.log("createCustomer",true);
	Assert.fail();
}
	@Test
	public void testDeleteCustomer() {
	Reporter.log("delete customer",true);
	Assert.fail();
}
}
