package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssrtionNonStatic {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testVerifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String actualTitle = driver.getTitle();
		String expectedResult = "Suyeduhgdoogle";
		SoftAssert a=new SoftAssert();
		a.assertEquals(actualTitle, expectedResult);
		driver.close();
		a.assertAll();
	}
	
}
