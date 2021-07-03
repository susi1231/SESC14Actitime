package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphone11 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("(//button)[2]")).click();
	driver.findElement(By.name("q")).sendKeys("i phone 11"+Keys.ENTER);
List<WebElement> Allprod = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 11') or contains(text(),'Apple iPhone 11')]/../..//div[contains(@class,'rR')]"));
List<WebElement> Allprice = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 11') or contains(text(),'Apple iPhone 11')]/../..//div[contains(@class,'WHN')]"));
	int count = Allprice.size();
	System.out.println(count);
	for (int i = 0; i < count; i++) 
	{
System.out.println(Allprod.get(i).getText()+"========>"+Allprice.get(i).getText());
	}
	driver.close();
	
}
}
