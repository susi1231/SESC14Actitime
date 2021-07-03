package assignment;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopupActiTime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.findElement(By.id("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.id("loginButton")).click();
		String parent=d.getWindowHandle();
		d.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		d.findElement(By.partialLinkText("About your actiTIME")).click();
		d.findElement(By.xpath("//td[@class='aboutLinks'] /a[2]")).click();
		Set<String> All=d.getWindowHandles();
		for (String one : All) {
			if(!one.equalsIgnoreCase(parent)) {
				d.switchTo().window(one);
				List<WebElement> headr=d.findElements(By.xpath("//u"));
				for (WebElement one1 : headr) {
					String text=one1.getText();
					System.out.println(text);
				}
				
			}
			
		}
		
		d.close();
		d.switchTo().window(parent);
		d.close();
		

	}

}
