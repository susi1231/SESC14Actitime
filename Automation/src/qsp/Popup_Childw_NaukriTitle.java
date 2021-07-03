package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Childw_NaukriTitle {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	Set<String> allW = driver.getWindowHandles();
	int count=allW.size();
	for (String e : allW) {
		driver.switchTo().window(e);
		System.out.println(driver.getTitle());
	}
	driver.quit();

	}

}
