package Handling_Mousehover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
	    WebElement resourse = driver.findElement(By.id("navbarDocumentation"));	
		Actions a=new Actions(driver);
		a.moveToElement(resourse).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement button = driver.findElement(By.linkText("READ FULL STORY"));
		a.doubleClick(button).perform();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals(" HackerEarth Case Study | Vtiger CRM ")) {
			
			System.out.println(" Hacker page is displayed");
		}
		else {
			System.out.println(" Hacker page is displayed");
		}
	}
}
