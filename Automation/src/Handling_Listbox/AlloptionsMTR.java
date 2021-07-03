//w a s to print all the options present in mtr listbox
package Handling_Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlloptionsMTR {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/kalyan/Desktop/hotel.html");
		Select s=new Select(driver.findElement(By.id("mtr")));
		List<WebElement> allOptions = s.getOptions();
		for (WebElement e : allOptions) {
			System.out.println(e.getText());
		}
			
		}
}
