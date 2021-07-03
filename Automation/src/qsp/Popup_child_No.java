package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_child_No {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	Set<String> allw = driver.getWindowHandles();
	int count=allw.size();
    System.out.println(count);
driver.close();
	}

}
