package Com.Actitime.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//bussiness logic method
	public void setLogin(String un, String pw)
	{
		username.sendKeys(un);
		password.sendKeys(pw);
		login.click();
	}
	
	
}
