package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("(//button[.='Click me!'])[1]")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		driver.switchTo().alert().accept();
		System.out.println(text);
		driver.close();
	}

}
