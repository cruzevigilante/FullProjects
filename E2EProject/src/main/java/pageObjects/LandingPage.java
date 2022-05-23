package pageObjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	
	public WebDriver driver;
	
	By getTitle =By.xpath("//h2[@class='_8eso']");
	By username = By.id("email");
	By password = By.id("pass");
    By submit = By.xpath("//button[@name='login']");

	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	

	public WebElement getUsername() {
		
		return driver.findElement(username);
	}
    public WebElement getPassWord() {
		
		return driver.findElement(password);
	}
    public WebElement submit() {
    	return driver.findElement(submit);
    }
    public WebElement getTitle() {
    	
    	return driver.findElement(getTitle);
    }
    public void getScreenshot(String testCaseName) throws IOException {
    	
    	TakesScreenshot ts=(TakesScreenshot) driver;
    	File source=ts.getScreenshotAs(OutputType.FILE);
    	String destinationfile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
    	FileUtils.copyFile(source,new File(destinationfile));
    }

	

}
