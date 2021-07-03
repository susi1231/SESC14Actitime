package qsp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_Assign {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[.='Login ']")).click();
		
	}

}
