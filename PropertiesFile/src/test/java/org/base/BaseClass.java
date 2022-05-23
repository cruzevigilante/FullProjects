package org.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	public static void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(url);
         
		
	}
	
}
