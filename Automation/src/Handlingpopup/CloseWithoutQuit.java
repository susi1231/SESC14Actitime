package Handlingpopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWithoutQuit {
static {System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.xpath("//a[contains(text(),'actiTIME')]")).click();
	Set<String> allwin = driver.getWindowHandles();
    for (String e : allwin) {
		driver.switchTo().window(e);
		driver.close();
	}
	}

}
