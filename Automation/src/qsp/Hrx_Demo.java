package qsp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hrx_Demo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/men-tshirts");
		WebElement e= driver.findElement(By.xpath("(//h3[.='HRX by Hrithik Roshan'])[1]/..//span[@class='product-discountedPrice']"));
		System.out.println(e.getText());
		driver.get("https://www.myntra.com/women-kurtas-kurtis-suits");

		WebElement e1= driver.findElement(By.xpath("(//h3[.='Libas']/../div/span/span)[1]"));
		System.out.println(e1.getText());
		driver.close();
		
		
		
	}

}
