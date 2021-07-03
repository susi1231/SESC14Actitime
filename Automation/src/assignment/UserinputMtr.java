package assignment;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UserinputMtr {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/kalyan/Desktop/hotel.html");
	Scanner sc=new Scanner(System.in);
	String userinput = sc.nextLine();
	Select s= new Select(driver.findElement(By.id("mtr")));
	List<WebElement> allOptions = s.getOptions();
	int count = 0;
	for (int i = 0; i <allOptions.size(); i++) {
		String text = allOptions.get(i).getText();
		if (text.equals(userinput)) {
			count++;
		}
		
	}
	if (count==0) {
		System.out.println(userinput+ "is not present");
	}
	else if (count==1) {
		System.out.println(userinput+ " "+"is present but without duplicate");
	}
	else {
		if (count>1) {
			System.out.println(userinput+" "+"is present but with duplicate value");
		}
	}
	
}
}
