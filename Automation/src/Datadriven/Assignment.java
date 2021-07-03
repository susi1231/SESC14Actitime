package Datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
    FileInputStream file= new FileInputStream("./data/commondata.property");
    Properties p=new Properties();
    p.load(file);
    String url = p.getProperty("url");
    String username = p.getProperty("username");
    String password = p.getProperty("password");
    WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get(url);
    driver.findElement(By.id("username")).sendKeys(username);
    driver.findElement(By.name("pwd")).sendKeys(password);
    driver.findElement(By.xpath("//div[.='Login ']")).click();
    driver.findElement(By.xpath("//a[.='Logout']")).click();
    driver.close();
    
	
	
	
	
	
	
	
	
	
	
	}
	}
