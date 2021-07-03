package assignment;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MTRListUnique_3q {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/kalyan/Desktop/hotel.html");
	Select s=new Select(driver.findElement(By.id("mtr")));
	List<WebElement> optn = s.getOptions();
	Set set=new HashSet();
	Set set1=new HashSet();
	for (WebElement e : optn) {
		String s2 = e.getText();
		if ( !set.add(e.getText())) {
			set1.add(e.getText());
		}
	}
      System.out.println(set1);
      driver.close();
}
	}


