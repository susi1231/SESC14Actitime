package assignment;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MTR_Userinput {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/kalyan/Desktop/hotel.html");
		Scanner sc=new Scanner(System.in);
		System.out.println("select your item");
		String userinput = sc.nextLine();
		Select s= new Select(driver.findElement(By.id("mtr")));
		List<WebElement> allOptions = s.getOptions();
		boolean result=true;
		for (WebElement e : allOptions) {
		boolean resul = e.getText().equalsIgnoreCase(userinput);
		if (resul==true) {
			break;
		}
		System.out.println(userinput);
		}
		driver.close();
	}
}
