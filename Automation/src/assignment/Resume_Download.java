package assignment;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resume_Download {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/nlogin/login");
	
		driver.findElement(By.id("usernameField")).sendKeys("kallikalyan9@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("7777777s");
		driver.findElement(By.xpath("//button[.='Login']")).click();
		driver.findElement(By.xpath("(//div[.='UPDATE PROFILE'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//i[.='Download'])[1]")).click();
		
	}
}
