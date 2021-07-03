package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemoPriority {
@Test(priority = 1, invocationCount = 3 )
public void createCustomer() {
	Reporter.log("createCustomer",true);
}
@Test(priority = 2,dependsOnMethods = "createCustomer" )
public void modifyCustomer() {
	Reporter.log("modifyCustomer",true);
}
@Test(priority = 3, dependsOnMethods = "createCustomer")
public void deleteCustomer()
{
	Reporter.log("DeleteCustomer",true);
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
}
}
