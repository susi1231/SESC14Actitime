package assignment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class OnlyDuplicates {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/kalyan/Desktop/hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s = new Select (mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		HashSet<String> hs1 = new HashSet();
		for(WebElement we : allOptions)
		{
			String text=we.getText();
			if(hs1.add(text)==false)
			{
				System.out.println(text);
			}
			
		}
		driver.close();
	}
}