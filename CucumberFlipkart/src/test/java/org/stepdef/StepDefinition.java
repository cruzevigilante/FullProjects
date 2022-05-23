package org.stepdef;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;

public class StepDefinition extends BaseClass {
	WebDriver driver;
	
	@Given("launch flipkart in chrome browser using {string} and {string}")
	public void launch_flipkart_in_chrome_browser_using_and(String string, String string2) {
		launchBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		
		
		
		
		//(//div[@class='xtXmba'])[3]
	}


}
