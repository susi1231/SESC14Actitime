package qsp;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Makemytrip {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		WebElement res = driver.findElement(By.xpath("//span[.='From']"));
		res.click();
		driver.findElement(By.xpath("//div[@id='react-autowhatever-1']/../input")).sendKeys("Bengaluru");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']/div/div/p[1]")).click();
		driver.findElement(By.xpath("//span[.='To']")).click();
		driver.findElement(By.xpath("//div[@id='react-autowhatever-1']/../input")).sendKeys("Goa");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='react-autowhatever-1']/../div/div[1]/ul/li[1]")).click();
		driver.findElement(By.xpath("(//div[@class='DayPicker-Month'])[1]/div[3]/div[5]/div[4]")).click();
		driver.findElement(By.xpath("//a[.='Search']")).click();
		
	}
}