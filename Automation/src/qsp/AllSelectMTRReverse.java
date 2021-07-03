package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelectMTRReverse {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/kalyan/Desktop/hotel.html");
        WebElement mtrlist = driver.findElement(By.id("mtr"));
        Select s=new Select(mtrlist);
        List<WebElement> alloptions = s.getOptions();
		for (int i =alloptions.size()-1; i>=0; i--) {
			System.out.println(alloptions.get(i).getText());
			
		}
		driver.close();
	}

}
