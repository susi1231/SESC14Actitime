package ChildWindow_Popup;
//was to close all the browsers except parent

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	String pwin = driver.getWindowHandle();
	Set<String> allwin = driver.getWindowHandles();
	for (String e : allwin) {
		driver.switchTo().window(e);
		if (!(pwin.equals(e))) {
			driver.close();
		}
		
	}
	

	}

}
