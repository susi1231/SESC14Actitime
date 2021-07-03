package ChildWindow_Popup;
//was to close the specific browser or to close only genpack

import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ExceptParent_delete {
	 static{
	    	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    }
		public static void main(String[] args) throws InterruptedException {
			System.out.println("enter the title which you want to close");
		Scanner sc= new Scanner(System.in);
		String userinput = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> allw = driver.getWindowHandles();
		for (String e : allw) {
			driver.switchTo().window(e);
			String title=driver.getTitle();
			if (title.equals(userinput)) {
				driver.close();
			}
		}
      		
}
}
