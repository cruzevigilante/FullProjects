package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookHomepage {
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void tc1(String value) {
             
		
		/*switch (value) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
		    driver= new ChromeDriver();
			
			break;
        case "edge":
        	WebDriverManager.edgedriver().setup();
		    driver= new EdgeDriver();
		    break;

		default:
			break;
		}
		driver.get("https://fb.com");
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("subash");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("123456");
		
		
		
		
	}*/
	}}

