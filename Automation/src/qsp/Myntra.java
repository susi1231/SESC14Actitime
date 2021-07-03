package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
   static {
	   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
   }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println(allLinks.size());
		int count=allLinks.size();
		for (WebElement e : allLinks) {
			System.out.println(e.getText());
		}
		driver.close();
		
        
	}

}
