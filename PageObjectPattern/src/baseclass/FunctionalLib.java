package baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FunctionalLib {
	
	WebDriver driver;
	
	By username=By.id("email");
	By password=By.id("pass");
	By submit = By.xpath("//button[@name='login']");
	
	
	public FunctionalLib(WebDriver driver) {
		
		this.driver=driver;
		
		}
	
    public WebElement Email() {
		
		return driver.findElement(username);
		
	}
	
    public WebElement Password() {
		
		return driver.findElement(password);
		
	}
    public WebElement Login() {
		
		return driver.findElement(submit);
		
	}
}
