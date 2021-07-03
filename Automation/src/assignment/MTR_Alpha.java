package assignment;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MTR_Alpha {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/kalyan/Desktop/hotel.html");
	Select s=new Select(driver.findElement(By.id("mtr")));
	List<WebElement> options = s.getOptions();
	Set set=new TreeSet();
	for ( WebElement e : options) {
		set.add(e.getText());
		
	}
	System.out.println(set);
	
	

	}

}
