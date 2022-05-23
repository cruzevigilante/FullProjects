package flipkart;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends FBBase {
	
	public static void main(String[] args) {
		
		 browserInitialize("https://flipkart.com");
  		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 
		 WebElement eventlink=driver.findElement(By.xpath("//div[contains(text(),'Mobiles')]")); 

		 Actions action = new Actions(driver);
	        action.keyDown(Keys.CONTROL).moveToElement(eventlink).click().perform(); 
	      
		 
		 
		 
	}
	
	
	

}
