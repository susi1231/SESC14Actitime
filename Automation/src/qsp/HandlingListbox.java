package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//li[.='English (UK)']")).click();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement monthlist = driver.findElement(By.id("month"));
	    Select s=new Select(driver.findElement(By.id("month")));
	    s.selectByValue("1");
	    Select s1=new Select(driver.findElement(By.id("day")));
	    s1.selectByValue("12");
	    WebElement yearlist = driver.findElement(By.id("year"));
	    Select s2=new Select(yearlist);
	    s2.selectByValue("1997");
	    
	    
	    
		
		
}
}