package assignment;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resume_upload {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/kalyan/Desktop/resume.html");
		driver.findElement(By.id("cv")).sendKeys("C:\\Users\\kalyan\\Desktop\\chaitu update resume.docx");
		Thread.sleep(5000);
		driver.get("file:///C:/Users/kalyan/Desktop/resume.html");
		Thread.sleep(5000);
		File f=new File("./data/Kalyan.doc");
		String absolutepath=f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(absolutepath);
	}
}
