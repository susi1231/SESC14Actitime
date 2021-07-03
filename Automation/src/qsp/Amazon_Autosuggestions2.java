package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Autosuggestions2 {
 static {
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
 }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='s-suggestion']"));
		int count = links.size();
		System.out.println(count);
		for (WebElement webElement : links) {
			String e=webElement.getText();
			System.out.println(e);
		}
		driver.close();
		
		

	}

}
