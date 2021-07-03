package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		if (title.equals("Google")) {
			System.out.println("title is google");
			
		}
		else
		{
			System.out.println("title is not matching");
		}
		String url=driver.getCurrentUrl();
		if (url.equals("https://www.google.co.in/")) {
			System.out.println("it is navigating to google.co.in");
		}
		else {
			System.out.println("it is not navigating to google.co.in");
		}
		driver.close();
		
	}

}
