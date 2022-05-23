package baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonPage {
	
	WebDriver driver;
	
	public AmazonPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	By searchbox= By.id("twotabsearchtextbox");
	By products = By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']");
	
	public WebElement SearchBox() {
		
		return driver.findElement(searchbox);
	}
	public WebElement products() {
		
		return driver.findElement(products);
	}
	

}
