package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBC_News_Assignments {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 }
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.bbc.com/");
	List<WebElement> title = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/../h3"));
	System.out.println(title.size());
	for (WebElement webElement : title) {
		System.out.println(webElement.getText());
	}
	driver.close();

}
}
