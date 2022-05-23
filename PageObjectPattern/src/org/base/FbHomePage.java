package org.base;
import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import baseclass.AmazonPage;
import baseclass.FunctionalLib;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FbHomePage  {

	public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://fb.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		FunctionalLib fun= new FunctionalLib(driver);
		fun.Email().sendKeys("subash@gmail.com");
		fun.Password().sendKeys("1234567");
		fun.Login().click();
		Thread.sleep(5000);
		
		driver.navigate().to("https://amazon.in");
		AmazonPage az= new AmazonPage(driver);
		az.SearchBox().sendKeys("iphone",Keys.ENTER);
		System.out.println(az.products().getText());
		
		}

}
