package Handlingpopup;
//was to close child tab first then the prent tab by using iterator
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class closeChildtab$Parent {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.linkText("//a[contains(text(),'actiTIME')]")).click();
	Set<String> allwin = driver.getWindowHandles();
    Iterator<String> itr=allwin.iterator();{
    String pwin = itr.next();
    String cwin = itr.next();
    driver.switchTo().window(cwin);
    driver.close();
    driver.switchTo().window(pwin);
    driver.close();
    }
	}

}
