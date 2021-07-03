package Handling_Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mtr_Reverse {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/kalyan/Desktop/hotel.html");
		Select s=new Select(driver.findElement(By.id("mtr")));
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		for (int i =count-1 ; i>=0; i--) {
			System.out.println(allOptions.get(i).getText());
			
		}
		driver.close();

}
}
