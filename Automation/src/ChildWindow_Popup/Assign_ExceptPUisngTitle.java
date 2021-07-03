package ChildWindow_Popup;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_ExceptPUisngTitle {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	String pwin = driver.getWindowHandle();
	String a=driver.getTitle();
	Set<String> allwin = driver.getWindowHandles();
	for (String e : allwin) {
		driver.switchTo().window(e);
		String title=driver.getTitle();
		if (!(title.equals(a))) {
			driver.close();
		}
		
	}
	
	}

}
