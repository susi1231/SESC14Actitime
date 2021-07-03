package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	System.out.println(links.size());
	for (int i = 0; i <links.size(); i++) {
		WebElement li = links.get(i);
		String text = li.getText();
		System.out.println(text);
	}
	driver.close();
}
}
