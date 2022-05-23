package org.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PhpTravels {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://phptravels.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@class='lvl-0 link nav-link']")).click();
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='money number']"));
		for (int i = 0; i < prices.size(); i++) {
			Class<? extends WebElement> class1 = prices.get(i).getClass();
			System.out.println(class1);

		}

		// driver.quit();

	}

}
