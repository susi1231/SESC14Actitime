package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_child_addressNauikri {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	Set<String> allwin = driver.getWindowHandles();
    for (String e : allwin) {
		System.out.println(e);
	}
   driver.quit();
	}

}
