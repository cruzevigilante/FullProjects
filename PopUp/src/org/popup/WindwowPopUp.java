package org.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindwowPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\Browser Launch\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Basic Auth")).click();
		
		System.out.println(driver.findElement(By.xpath("//h3[normalize-space()='Basic Auth']")));
		
		
		
		
		
		
		
		
	}

}
