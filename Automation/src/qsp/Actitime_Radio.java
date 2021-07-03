package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_Radio {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean select = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).isSelected();
		System.out.println(select);
		
		driver.close();
	

	}

}
