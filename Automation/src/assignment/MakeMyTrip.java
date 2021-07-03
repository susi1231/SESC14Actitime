package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MakeMyTrip {
	static{
    	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//span[.='From']"));
	driver.findElement(By.xpath("//div[@role='combobox']/input")).sendKeys("bangalore");
	

}
}
