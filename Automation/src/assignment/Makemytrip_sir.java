package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip_sir {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.id("fromCity")).click();

	}

}
