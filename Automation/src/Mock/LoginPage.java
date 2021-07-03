package Mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id="username")
private WebElement unam;
 public LoginPage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 public void SetLogin(String unt)
 {
	 unam.sendKeys(unt);
 }
}


@Test
Public void testLogin() throws Interrupted Exception{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	LoginPage l=new LoginPage(driver);
	l.SetLogin("admin");
}