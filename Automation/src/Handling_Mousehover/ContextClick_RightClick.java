package Handling_Mousehover;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class ContextClick_RightClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		WebElement rightclick = driver.findElement(By.linkText("actiTIME Inc."));
		Actions a=new Actions(driver);
		a.contextClick(rightclick).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		driver.quit();
		
}
}
