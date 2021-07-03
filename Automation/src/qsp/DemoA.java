package qsp;

import org.openqa.selenium.WebDriver;

public class DemoA {
	
public static void testA(WebDriver driver) 
{
	driver.get("https://www.instagram.com/");
	System.out.println(driver.getTitle());
	driver.close();
	
}
}
