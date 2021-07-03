package Com.Actitime.Testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Com.Actitime.Pom.LogInPage;

public class MainMethodsCls {
 static {
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 
 }
 @Test
 public void testLogin() throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demo.actitime.com/");
	 LogInPage l=new LogInPage(driver);
	l.setLogin("admin1", "manager");
	Thread.sleep(3000);
	l.setLogin("admin", "manager");
	
 }
}
