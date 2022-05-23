package org.base;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IterateProducts {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\Browser Launch\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> products=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		for (int i = 0; i < products.size(); i++) {
			
			
			System.out.println(products.get(i).getText());
			
		}
		/*Iterator<WebElement> it=products.iterator();
		while (it.hasNext()) {
			//WebElement webElement = (WebElement) it.next();
			System.out.println(it.next());
		}*/
	
	
	}
		
		//driver.close();
		

		
		
		
	}


