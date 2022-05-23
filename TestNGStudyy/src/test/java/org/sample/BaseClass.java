package org.sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static WebElement findElement;

	public static void launchBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);

	}

	public void loginInfo(WebElement ref, String string) {

		ref.sendKeys(string);
	}

	public static void clkButton(WebElement ref) {
		ref.click();
	}

	public static WebElement locators(String locator, String value) {
		if (locator.equals("id")) {
			return findElement = driver.findElement(By.id(value));
			
		}else if (locator.equals("name")) {
			return findElement = driver.findElement(By.name(value));

			
			
		}else if (locator.equals("tagName")) {
			return findElement = driver.findElement(By.tagName(value));
		
        

        }else if (locator.equals("xpath")) {
	        return findElement = driver.findElement(By.xpath(value));
	        
	        
	        }else if (locator.equals("cssSelector")) {
				return findElement = driver.findElement(By.cssSelector(value));
	        }
		return findElement;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
		
		
		
		
		
		
		
		
		
		
		
