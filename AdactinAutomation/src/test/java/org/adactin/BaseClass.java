package org.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public void launchBrowser() {
       
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

}
