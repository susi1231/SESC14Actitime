package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popup_Notification {
	static{
    	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }
	public static void main(String[] args) {
	ChromeOptions ch=new ChromeOptions();
	ch.addArguments("dhgdtgdghchg");
	WebDriver driver=new ChromeDriver(ch);
	driver.get("https://www.yatra.com/");
	
	}
}
