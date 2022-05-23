package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class FacebookLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\Browser Launch\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		Assert.assertFalse(driver.getTitle().contains("Facebook"));
		//driver.findElement(By.xpath("//[@class='inputtext _55r1 _6luy']")).sendKeys("subash");
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//h2[@class='_8eso']")).getText());
        //driver.findElement(By.id("email")).sendKeys("subash");
        //driver.findElement(By.id("pass")).sendKeys("123456");
        //Thread.sleep(2000);
       // driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
