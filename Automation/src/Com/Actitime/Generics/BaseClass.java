package Com.Actitime.Generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public WebDriver driver;
	
  @BeforeClass(groups= {"smoketest", "regressiontest"})
  public void openBrowser() {
   Reporter.log("openBrowser",true);
  driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  @AfterClass(groups= {"smoketest", "regressiontest"})
  public void closeBrowser() {
  Reporter.log("closeBrowser",true);
  driver.close();
  }
  
  @BeforeMethod(groups= {"smoketest", "regressiontest"})
  public void login() {
	  Reporter.log("login",true);
	  driver.get("https://demo.actitime.com/");
  driver.findElement(By.id("username")).sendKeys("admin");
  driver.findElement(By.name("pwd")).sendKeys("manager");
  driver.findElement(By.xpath("//div[.='Login ']")).click();
  }
  @AfterMethod(groups= {"smoketest", "regressiontest"})
  
  public void logout() {
	  Reporter.log("logout",true);
	  driver.findElement(By.xpath("//a[.='Logout']")).click();
  }
}
