package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion1 {
    static{
    	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.co.in/");
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(3000);
	List<WebElement> allLinks = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
	int count = allLinks.size();
	for (WebElement e : allLinks) {
		System.out.println(e.getText());
	}
	System.out.println(allLinks.get(count-1).getText());
	driver.close();

	}

}
