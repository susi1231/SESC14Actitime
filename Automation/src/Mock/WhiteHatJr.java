package Mock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhiteHatJr {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
	driver.get("https://main-ui-math-git-mathactivitystudio.whjr.dev/s/login");
	driver.findElement(By.xpath("//span[text()='Login With Password']")).click();
	driver.findElement(By.id("emailOrMobile")).sendKeys("kanisirisusi@gmail.com");
	driver.findElement(By.id("password")).sendKeys("7777777s");
}
}
