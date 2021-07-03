package assignment;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class AllurlWiprowSearch {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Scanner sc=new Scanner(System.in);
	System.out.println("enter userinput");
	String userInput = sc.nextLine();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.id("q")).sendKeys(userInput,Keys.ENTER);
	allLinks=driver.findElements(By.xpath("//a"));
	
	
}
}
