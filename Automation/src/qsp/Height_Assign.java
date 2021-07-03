package qsp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Height_Assign {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	int height = driver.findElement(By.id("email")).getSize().getHeight();
	int height1=driver.findElement(By.id("passContainer")).getSize().getHeight();
	System.out.println("username height"+":"+ height);
	System.out.println("password height"+":"+height1);
	if(height==height1)
	{
		System.out.println("height of username and password matches");
	}
	else
	{
		System.out.println("Not matches");
	}
	driver.close();
}
}
