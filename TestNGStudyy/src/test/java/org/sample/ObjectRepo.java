package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectRepo extends BaseClass {
	@FindBy(id="username")
	private WebElement username;
	
	
	@FindBy(id="password")

	private WebElement password;
	
	@FindBy(id="login")

    private WebElement login;
    
    
    
 
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	
	
}
