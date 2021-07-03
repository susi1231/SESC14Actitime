package qsp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelectMTRUnique {
static {
	System.setProperty("webdriver.chrome.driver", "driver.chromedriver.exe");
}
	public static void main(String[] args){
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/kalyan/Desktop/hotel.html");
	WebElement mtrlist = driver.findElement(By.id("mtr"));
	Select s=new Select(mtrlist);
	Set<WebElement> allOptions = (Set<WebElement>) s.getOptions();
	for (WebElement e : allOptions) {
		System.out.println(e.getText());
	}
	driver.close();
	}

}
