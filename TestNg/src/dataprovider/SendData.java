package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendData {
	
	public static WebDriver driver;
	
	@DataProvider
    private Object[][] getData() {
		Object [][] data = new Object[3][2];
		data[0][0]="one";
		data[0][1]="two";
		data[1][0]="three";
		data[1][1]="four";
		data[2][0]="five";
		data[2][1]="six";
		return data;

	}
    
	@Test(dataProvider="getData")
	public void login(String s, String s1) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://fb.com");
		WebElement txtusername=driver.findElement(By.id("email"));
		txtusername.sendKeys(s);
		WebElement txtpass=driver.findElement(By.id("pass"));
		txtpass.sendKeys(s1);
		//driver.quit();
		
}
						
	}
