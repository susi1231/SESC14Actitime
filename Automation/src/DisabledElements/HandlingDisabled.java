package DisabledElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.internal.txw2.Document;

public class HandlingDisabled {
	static {
		   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	   }
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("file:///C:/Users/kalyan/Desktop/Dsabled.html");
			driver.findElement(By.id("t1")).sendKeys("admin");
			JavascriptExecutor j=(JavascriptExecutor) driver;
			j.executeScript("document.getElementById('t2').value='manager'");
		
			
			
		}
}
