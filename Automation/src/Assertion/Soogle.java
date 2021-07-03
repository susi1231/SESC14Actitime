package Assertion;
//in the example eventhough title is not matchong , it pass the test case. so have to go for assertion in order 
//to fail the testcase
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Soogle {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@Test
public void testVerifyTitle() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	String actualTitle = driver.getTitle();
	String expectedResult = "Soogle";
	if (actualTitle.equals(expectedResult)) {
	Reporter.log("title is matching", true);
	}
	else {
		Reporter.log("title is not matching", true);
	}
	driver.close();
}
}
