package qsp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Width_Assign {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	int widthu = driver.findElement(By.id("email")).getSize().getWidth();
	int widthp=driver.findElement(By.id("passContainer")).getSize().getWidth();
	System.out.println("username width"+":"+ widthu);
	System.out.println("password width"+":"+ widthp);
	if(widthu==widthp)
	{
		System.out.println("width of username and password matches");
	}
	else
	{
		System.out.println("Not matches");
	}
	driver.close();
}
}
