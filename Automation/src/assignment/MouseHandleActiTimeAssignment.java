package assignment;

import java.awt.AWTException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHandleActiTimeAssignment {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String ph = driver.getTitle();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
		driver.findElement(By.partialLinkText("Service Agreement")).click();
		String ch = driver.getTitle();
		Set<String> window = driver.getWindowHandles();
		 for(String heading:window)
		 {
			driver.switchTo().window(heading);
			if(!(ph.equals(ch)))
			{
				List<WebElement> headings = driver.findElements(By.tagName("h2"));
				for(WebElement hd:headings)
				{
					System.out.println(hd.getText());
				}
			//	driver.close();		
			}
		 }
		// Thread.sleep(4000);
		// driver.close();	 
	}

}