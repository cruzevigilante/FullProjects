package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonShopping {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\Browser Launch\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.navigate().to("https://rahulshettyacademy.com/angularpractice/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("subash chandra bose");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("subash123@gmail.com");
	driver.findElement(By.id("exampleInputPassword1")).sendKeys("qwertyuiop");
	driver.findElement(By.id("exampleCheck1")).click();
	driver.findElement(By.id("exampleFormControlSelect1")).click();
	driver.findElement(By.className("form-check-input")).click();
	//driver.findElement(By.className("form-control")).sendKeys("13-12-1994");
	
	
	
	
	
	}

}
