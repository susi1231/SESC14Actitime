package assignment;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_2 {
    static {
    	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/");
	driver.findElement(By.xpath("//div[.='Login']")).click();
	driver.findElement(By.xpath("//label[.='Email ID / Username']/../input")).sendKeys("kallikalyan9@gmail.com");
	driver.findElement(By.xpath("//label[.='Password']/../input")).sendKeys("7777777s");
	driver.findElement(By.xpath("//button[.='Login']")).click();
	driver.findElement(By.xpath("(//div[.='UPDATE PROFILE'])[2]")).click();
	File f=new File("./data/Kalyan.doc");
	String absolutePath = f.getAbsolutePath();
	driver.findElement(By.id("attachCV")).sendKeys(absolutePath);
    driver.quit();
	}

}
