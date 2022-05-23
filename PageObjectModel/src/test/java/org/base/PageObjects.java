package org.base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects extends BaseClass {
	
	public PageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUsername() {
		return username;
	}
    
	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="pass")
    private WebElement password;
	@FindBy(xpath="//button[@name='login']")
    private WebElement login;

    

}
