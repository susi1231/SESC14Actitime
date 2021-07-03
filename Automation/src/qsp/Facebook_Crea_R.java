package qsp;
//WAS to compare the width of email & password textbox are equal or not in facebook.com?
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Crea_R {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		int y = driver.findElement(By.xpath("//label[.='Female']")).getLocation().getY();
		int y1 = driver.findElement(By.xpath("//label[.='Male']")).getLocation().getY();
		int y2=driver.findElement(By.xpath("//label[.='Custom']")).getLocation().getY();
		System.out.println(y);
		System.out.println(y1);
		if (y==y1 && y==y2) {
			System.out.println("same");
		}
		else
		{
			System.out.println("not same"+ "");
		}
		driver.close();
		

	}

}
