package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClearTrip {
	static {
		   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	   }
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.cleartrip.com/");
			driver.findElement(By.xpath("//h4[.='From']/../div/div/div/input")).sendKeys("bangalore");
			Actions a=new 
			driver.findElement(By.linkText("//p[contains(text(),'BLR')]")).click();
}
}