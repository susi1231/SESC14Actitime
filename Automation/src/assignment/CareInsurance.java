package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsurance {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.name("dob")).click();
		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
		Select s= new Select(month);
		s.selectByVisibleText("Jan");
		Select s1=new Select(driver.findElement(By.className("ui-datepicker-year")));
		s1.selectByVisibleText("1997");
		driver.findElement(By.xpath("//a[.='12']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9951714865");
		Thread.sleep(9000);
        driver.findElement(By.xpath("//button[@id='renew_policy_submit']")).click();
	   
	}

}
