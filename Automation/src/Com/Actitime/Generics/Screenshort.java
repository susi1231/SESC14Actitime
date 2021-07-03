package Com.Actitime.Generics;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshort {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@Test
public void takeScreenShort() throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	TakesScreenshot t=(TakesScreenshot) driver;
	File src = t.getScreenshotAs(OutputType.FILE);
	File dest=new File("./Screenshort/ss.png");
	//when were we want to move the file from one location to another location
	FileUtils.copyFile(src,dest);
	driver.close();
	
}
}
