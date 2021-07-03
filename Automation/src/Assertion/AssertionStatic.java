package Assertion;
//if the comparision is fails then the statement which is present after the assert statement is will
//not execute
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertionStatic {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testVerifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String actualTitle = driver.getTitle();
		String expectedResult = "Soogle";
		Assert.assertEquals(actualTitle, expectedResult);
		driver.close();
	}
	
}
