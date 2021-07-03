package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 }
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.cleartrip.com/");
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("New Delhi, IN - Indira Gandhi Airport (DEL)");
	driver.findElement(By.className("icon ir datePicker")).click();
	driver.findElement(By.xpath("(//a[.='28'])[2]")).click();
	driver.findElement(By.id("SearchBtn")).click();
	
	

	}

}
