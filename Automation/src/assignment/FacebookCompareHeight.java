package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCompareHeight {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		int y = driver.findElement(By.id("email")).getLocation().getX();
		int y1 = driver.findElement(By.id("pass")).getLocation().getX();
		System.out.println(y);
		System.out.println(y1);
		if (y==y1) {
			System.out.println("same");
		}
		else
		{
			System.out.println("not same"+ "");
		}
		driver.close();
		

	}

}
