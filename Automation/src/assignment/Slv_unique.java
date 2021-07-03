package assignment;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Slv_unique {
   static {
	   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
   }
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/kalyan/Desktop/hotel.html");
	Select s=new Select(driver.findElement(By.id("slv")));
	List<WebElement> allOptions =s.getOptions();
	Set set=new HashSet();
	for (int i = 0; i <allOptions.size(); i++) {
		String text=allOptions.get(i).getText();
		
	}
	for (WebElement e : allOptions) {
		set.add(e.getText());
	}
	System.out.println(set);
	System.out.println(set.size());
	for (Object object : set) {
		System.out.println(object);
	}
	
driver.close();
	}

}

