package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelectOptions {
    static {
    	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/kalyan/Desktop/hotel.html");
		WebElement options = driver.findElement(By.id("slv"));
		Select s=new Select(options);
		List<WebElement> selectedoptions = s.getAllSelectedOptions();
		for (int i = 0; i < selectedoptions.size(); i++) {
		 System.out.println(selectedoptions.get(i).getText());
		}
		driver.close();
	}

}
